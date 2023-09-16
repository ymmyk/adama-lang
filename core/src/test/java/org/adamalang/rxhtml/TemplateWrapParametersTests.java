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

public class TemplateWrapParametersTests extends BaseRxHtmlTest {
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
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    $.SA(c,'parameter:a',\"123\");");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.SA(this.__dom,'parameter:b',\"x \" + this['y']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y(a,d,'y',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    var g=$.RX(['b']);");
    gold.append("\n    g.a='123';");
    gold.append("\n    $.Y2(a,g,'b','y',function(h) {");
    gold.append("\n      g.b=\"x \" + h['y']");
    gold.append("\n      g.__();");
    gold.append("\n    });");
    gold.append("\n    $.WP(c,a,'param_wrapper',g,function(e,d,f) {");
    gold.append("\n    });");
    gold.append("\n    b.append(c);");
    gold.append("\n  });");
    gold.append("\n})(RxHTML);");
    gold.append("\nStyle:");
    gold.append("\nShell:<!DOCTYPE html>");
    gold.append("\n<html>");
    gold.append("\n<head><script src=\"https://aws-us-east-2.adama-platform.com/libadama.js\"></script><script>");
    gold.append("\n");
    gold.append("\n(function($){");
    gold.append("\n  $.PG(['fixed',''], function(b,a) {");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    $.SA(c,'parameter:a',\"123\");");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.SA(this.__dom,'parameter:b',\"x \" + this['y']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y(a,d,'y',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    var g=$.RX(['b']);");
    gold.append("\n    g.a='123';");
    gold.append("\n    $.Y2(a,g,'b','y',function(h) {");
    gold.append("\n      g.b=\"x \" + h['y']");
    gold.append("\n      g.__();");
    gold.append("\n    });");
    gold.append("\n    $.WP(c,a,'param_wrapper',g,function(e,d,f) {");
    gold.append("\n    });");
    gold.append("\n    b.append(c);");
    gold.append("\n  });");
    gold.append("\n})(RxHTML);");
    gold.append("\n");
    gold.append("\n");
    gold.append("\n</script><style>");
    gold.append("\n");
    gold.append("\n");
    gold.append("\n");
    gold.append("\n</style></head><body></body><script>RxHTML.init();</script></html>");
    return gold.toString();
  }
  @Override
  public String source() {
    StringBuilder source = new StringBuilder();
    source.append("<forest>");
    source.append("\n    <page uri=\"/\">");
    source.append("\n        <div rx:wrap=\"param_wrapper\" parameter:a=\"123\" parameter:b=\"x {y}\">");
    source.append("\n        </div>");
    source.append("\n    </page>");
    source.append("\n</forest>");
    return source.toString();
  }
}
