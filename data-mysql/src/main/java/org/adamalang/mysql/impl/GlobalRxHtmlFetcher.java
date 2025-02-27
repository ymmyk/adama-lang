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
package org.adamalang.mysql.impl;

import org.adamalang.ErrorCodes;
import org.adamalang.common.Callback;
import org.adamalang.common.ErrorCodeException;
import org.adamalang.common.ExceptionLogger;
import org.adamalang.mysql.DataBase;
import org.adamalang.mysql.data.SpaceInfo;
import org.adamalang.mysql.model.Spaces;
import org.adamalang.runtime.sys.web.rxhtml.LiveSiteRxHtmlResult;
import org.adamalang.runtime.sys.web.rxhtml.RxHtmlFetcher;
import org.adamalang.rxhtml.RxHtmlResult;
import org.adamalang.rxhtml.RxHtmlTool;
import org.adamalang.rxhtml.template.config.ShellConfig;

/** fetch an RxHTML document from a space */
public class GlobalRxHtmlFetcher implements RxHtmlFetcher {
  private final static ExceptionLogger EXLOGGER = ExceptionLogger.FOR(GlobalRxHtmlFetcher.class);
  private final DataBase database;
  private final String environment;

  public GlobalRxHtmlFetcher(DataBase database, String environment) {
    this.database = database;
    this.environment = environment;
  }

  @Override
  public void fetch(String space, Callback<LiveSiteRxHtmlResult> callback) {
    try {
      SpaceInfo spaceInfo = Spaces.getSpaceInfo(database, space);
      String rxhtml = Spaces.getRxHtml(database, spaceInfo.id);
      RxHtmlResult rxhtmlResult = RxHtmlTool.convertStringToTemplateForest(rxhtml, null, ShellConfig.start().withEnvironment(environment).end());
      String html = rxhtmlResult.shell.makeShell(rxhtmlResult);
      callback.success(new LiveSiteRxHtmlResult(html, rxhtmlResult.paths));
    } catch (Exception ex) {
      callback.failure(ErrorCodeException.detectOrWrap(ErrorCodes.FRONTEND_FAILED_RXHTML_LOOKUP, ex, EXLOGGER));
    }
  }
}
