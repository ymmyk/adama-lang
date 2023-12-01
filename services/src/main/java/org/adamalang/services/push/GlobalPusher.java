/*
* Adama Platform and Language
* Copyright (C) 2021 - 2023 by Adama Platform Initiative, LLC
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published
* by the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU Affero General Public License for more details.
* 
* You should have received a copy of the GNU Affero General Public License
* along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package org.adamalang.services.push;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.adamalang.ErrorCodes;
import org.adamalang.common.*;
import org.adamalang.common.keys.VAPIDFactory;
import org.adamalang.common.keys.VAPIDPublicPrivateKeyPair;
import org.adamalang.mysql.DataBase;
import org.adamalang.mysql.data.DeviceSubscription;
import org.adamalang.mysql.model.Domains;
import org.adamalang.mysql.model.PushSubscriptions;
import org.adamalang.runtime.natives.NtPrincipal;
import org.adamalang.runtime.remote.Service;
import org.adamalang.runtime.remote.ServiceRegistry;
import org.adamalang.services.FirstPartyMetrics;
import org.adamalang.services.ServiceConfig;
import org.adamalang.services.push.webpush.Subscription;
import org.adamalang.services.push.webpush.WebPushRequestFactory128;
import org.adamalang.services.sms.Twilio;
import org.adamalang.web.client.SimpleHttpRequest;
import org.adamalang.web.client.VoidCallbackHttpResponder;
import org.adamalang.web.client.WebClientBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

public class GlobalPusher implements Pusher {
  private final static Logger LOGGER = LoggerFactory.getLogger(GlobalPusher.class);

  private final FirstPartyMetrics metrics;
  private final DataBase dataBase;
  private final VAPIDFactory factory;
  private final SimpleExecutor executor;
  private final WebClientBase webClientBase;
  private final WebPushRequestFactory128 webPushFactory128;

  public GlobalPusher(FirstPartyMetrics metrics, DataBase dataBase, SimpleExecutor executor, String email, WebClientBase webClientBase) throws Exception {
    this.metrics = metrics;
    this.dataBase = dataBase;
    SecureRandom random = new SecureRandom();
    this.factory = new VAPIDFactory(random);
    this.executor = executor;
    this.webClientBase = webClientBase;
    this.webPushFactory128 = new WebPushRequestFactory128(email, random);
  }

  private void webPush(ObjectNode rawSub, DeviceSubscription subscription, VAPIDPublicPrivateKeyPair pair, String payload, Callback<Void> callback) throws Exception {
    Subscription sub = new Subscription(rawSub);
    SimpleHttpRequest request = webPushFactory128.make(pair, sub, 14, payload.getBytes(StandardCharsets.UTF_8));
    webClientBase.executeShared(request, new VoidCallbackHttpResponder(LOGGER, metrics.webpush_send.start(), new Callback<Void>() {
      int boundId = subscription.id;

      @Override
      public void success(Void value) {
        callback.success(null);
      }

      @Override
      public void failure(ErrorCodeException ex) {
        // track some metrics
        if (ex.code == ErrorCodes.WEB_CALLBACK_RESOURCE_GONE) {
          executor.execute(new NamedRunnable("delete-sub") {
            @Override
            public void execute() throws Exception {
              PushSubscriptions.deleteSubscription(dataBase, boundId);
            }
          });
        }
      }
    }));
  }

  @Override
  public void notify(String pushTrackingToken, String domain, NtPrincipal who, String payload, Callback<Void> callback) {
    executor.execute(new NamedRunnable("notify") {
      @Override
      public void execute() throws Exception {
        try {
          VAPIDPublicPrivateKeyPair pair = Domains.getOrCreateVapidKeyPair(dataBase, domain, factory);
          // TODO: get FireBase auth for the domain
          var subs = PushSubscriptions.list(dataBase, domain, who);
          for (DeviceSubscription subscription : subs) {
            ObjectNode raw = Json.parseJsonObject(subscription.subscription);
            String method = raw.get("@method").textValue();
            if ("webpush".equals(method)) {
              webPush(raw, subscription, pair, payload, callback);
            } else if ("capacitor".equals(method)) { // use firebase stuff

            }
          }
        } catch (Exception ex) {
          LOGGER.error("failed-notify", ex);
          callback.failure(new ErrorCodeException(ErrorCodes.GLOBAL_PUSHER_UNKNOWN_FAILURE));
        }
      }
    });

  }

  public void install() {
    ServiceRegistry.add("push", Push.class, (space, configRaw, keys) -> new Push(metrics, GlobalPusher.this));
  }
}
