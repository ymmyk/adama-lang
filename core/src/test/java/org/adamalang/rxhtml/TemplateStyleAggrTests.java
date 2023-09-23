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
package org.adamalang.rxhtml;

public class TemplateStyleAggrTests extends BaseRxHtmlTest {
  @Override
  public boolean dev() {
    return false;
  }
  @Override
  public String issues() {
    StringBuilder issues = new StringBuilder();
    issues.append("");
    return issues.toString();
  }
  @Override
  public String gold() {
    StringBuilder gold = new StringBuilder();
    gold.append("JavaScript:(function($){");
    gold.append("\n  $.PG(['fixed',''], function(b,a) {");
    gold.append("\n    var c=$.X();");
    gold.append("\n    var d=$.E('button');");
    gold.append("\n    $.onT(d,'click',$.pV(a),'open');");
    gold.append("\n    d.append($.T('Toggle'));");
    gold.append("\n    b.append(d);");
    gold.append("\n    var d=$.E('button');");
    gold.append("\n    $.onT(d,'mouseenter',$.pV(a),'enter');");
    gold.append("\n    d.append($.T('Toggle'));");
    gold.append("\n    b.append(d);");
    gold.append("\n  });");
    gold.append("\n})(RxHTML);");
    gold.append("\nStyle:common style here also common also common");
    gold.append("\nShell:<!DOCTYPE html>");
    gold.append("\n<html>");
    gold.append("\n<head><script src=\"https://aws-us-east-2.adama-platform.com/libadama.js\"></script><script>");
    gold.append("\n");
    gold.append("\n(function($){");
    gold.append("\n  $.PG(['fixed',''], function(b,a) {");
    gold.append("\n    var c=$.X();");
    gold.append("\n    var d=$.E('button');");
    gold.append("\n    $.onT(d,'click',$.pV(a),'open');");
    gold.append("\n    d.append($.T('Toggle'));");
    gold.append("\n    b.append(d);");
    gold.append("\n    var d=$.E('button');");
    gold.append("\n    $.onT(d,'mouseenter',$.pV(a),'enter');");
    gold.append("\n    d.append($.T('Toggle'));");
    gold.append("\n    b.append(d);");
    gold.append("\n  });");
    gold.append("\n})(RxHTML);");
    gold.append("\n");
    gold.append("\n");
    gold.append("\n</script><style>");
    gold.append("\n");
    gold.append("\ncommon style here also common also common");
    gold.append("\n");
    gold.append("\n</style></head><body></body><script>RxHTML.init();</script></html>");
    return gold.toString();
  }
  @Override
  public String source() {
    StringBuilder source = new StringBuilder();
    source.append("<forest>");
    source.append("\n    <style>");
    source.append("\n        common style here");
    source.append("\n    </style>");
    source.append("\n    <page uri=\"/\">");
    source.append("\n        <style>");
    source.append("\n            also common");
    source.append("\n        </style>");
    source.append("\n        <button rx:click=\"toggle:open\">Toggle</button>");
    source.append("\n        <button rx:mouseenter=\"toggle:enter\">Toggle</button>");
    source.append("\n        <style>");
    source.append("\n            also common");
    source.append("\n        </style>");
    source.append("\n    </page>");
    source.append("\n</forest>");
    return source.toString();
  }
  @Override
  public String schema() {
    StringBuilder gold = new StringBuilder();
    gold.append("{");
    gold.append("\n  \"/\" : {");
    gold.append("\n    \"enter\" : \"bool\",");
    gold.append("\n    \"open\" : \"bool\"");
    gold.append("\n  }");
    gold.append("\n}");
    return gold.toString();
  }
}
