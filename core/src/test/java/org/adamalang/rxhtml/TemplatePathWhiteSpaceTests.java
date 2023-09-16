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

public class TemplatePathWhiteSpaceTests extends BaseRxHtmlTest {
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
    gold.append("\n    b.append($.T(' Simple Page '));");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['lookup']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pD(a),d,'lookup',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['value']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pI($.pD(a),'lookup'),d,'value',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['root']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pR($.pV(a)),d,'root',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['lookup']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pD(a),d,'lookup',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['value']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pI($.pD(a),'lookup'),d,'value',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['root']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pR($.pV(a)),d,'root',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
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
    gold.append("\n    b.append($.T(' Simple Page '));");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['lookup']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pD(a),d,'lookup',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['value']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pI($.pD(a),'lookup'),d,'value',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['root']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pR($.pV(a)),d,'root',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['lookup']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pD(a),d,'lookup',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['value']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pI($.pD(a),'lookup'),d,'value',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
    gold.append("\n    b.append(c);");
    gold.append("\n    var c = $.E('div');");
    gold.append("\n    {");
    gold.append("\n      var d = {};");
    gold.append("\n      d.__dom = c;");
    gold.append("\n      var e = (function() {");
    gold.append("\n        $.ACLASS(this.__dom,this['root']);");
    gold.append("\n      }).bind(d);");
    gold.append("\n      $.Y($.pR($.pV(a)),d,'root',e);");
    gold.append("\n      e();");
    gold.append("\n    }");
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
    source.append("\n        Simple Page");
    source.append("\n        <div class=\"{data:lookup} \"></div>");
    source.append("\n        <div class=\"{data:lookup/value} \"></div>");
    source.append("\n        <div class=\"{view:/root} \"></div>");
    source.append("\n        <div class=\"{   data : lookup } \"></div>");
    source.append("\n        <div class=\"{   data : lookup / value  } \"></div>");
    source.append("\n        <div class=\"{   view :  / root   } \"></div>");
    source.append("\n    </page>");
    source.append("\n</forest>");
    return source.toString();
  }
}
