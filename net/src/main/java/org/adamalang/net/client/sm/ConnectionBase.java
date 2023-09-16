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
package org.adamalang.net.client.sm;

import org.adamalang.common.SimpleExecutor;
import org.adamalang.net.client.ClientConfig;
import org.adamalang.net.client.LocalRegionClientMetrics;
import org.adamalang.net.client.InstanceClientFinder;
import org.adamalang.net.client.routing.Router;

/** each state machine has some common ground, and we form a base around that */
public class ConnectionBase {
  public final ClientConfig config;

  // metrics for the client
  public final LocalRegionClientMetrics metrics;

  // how to map keys to targets;
  public final Router router;

  // how we turn targets into clients
  public final InstanceClientFinder mesh;

  // how we handle thread safety and time
  public final SimpleExecutor executor;

  public ConnectionBase(ClientConfig config, LocalRegionClientMetrics metrics, Router router, InstanceClientFinder mesh, SimpleExecutor executor) {
    this.config = config;
    this.metrics = metrics;
    this.router = router;
    this.mesh = mesh;
    this.executor = executor;
  }
}
