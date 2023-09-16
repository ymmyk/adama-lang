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

public class TemplateMultipageWithMultiAuthTests extends BaseRxHtmlTest {
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
    gold.append("\n  $.PG(['fixed','customeraction','text','customer_id','fixed','signin'], function(b,a) {");
    gold.append("\n    b.append($.T(' Sign in for customers '));");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','customer','text','customer_id'], function(b,a) {");
    gold.append("\n    var c = $.aRDp(a, function(vs) { return \"/customeraction/\" + vs['customer_id'] + \"/signin\"; });");
    gold.append("\n    if ($.ID('default',c).abort) {");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    b.append($.T(' Simple Page for customers '));");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','adminaction','text','admin_id','fixed','signin'], function(b,a) {");
    gold.append("\n    b.append($.T(' Sign in for admins '));");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','admin','text','admin_id'], function(b,a) {");
    gold.append("\n    var c = $.aRDp(a, function(vs) { return \"/adminaction/\" + vs['admin_id'] + \"/signin\"; });");
    gold.append("\n    if ($.ID('default',c).abort) {");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    b.append($.T(' Simple Page for admins '));");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','bounce'], function(b,a) {");
    gold.append("\n    var c = $.aRDz('/logingeneric');");
    gold.append("\n    if ($.ID('default',c).abort) {");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','logingeneric'], function(b,a) {");
    gold.append("\n    b.append($.T(' Simple Page '));");
    gold.append("\n  });");
    gold.append("\n})(RxHTML);");
    gold.append("\nStyle:");
    gold.append("\nShell:<!DOCTYPE html>");
    gold.append("\n<html>");
    gold.append("\n<head><script src=\"https://aws-us-east-2.adama-platform.com/libadama.js\"></script><script>");
    gold.append("\n");
    gold.append("\n(function($){");
    gold.append("\n  $.PG(['fixed','customeraction','text','customer_id','fixed','signin'], function(b,a) {");
    gold.append("\n    b.append($.T(' Sign in for customers '));");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','customer','text','customer_id'], function(b,a) {");
    gold.append("\n    var c = $.aRDp(a, function(vs) { return \"/customeraction/\" + vs['customer_id'] + \"/signin\"; });");
    gold.append("\n    if ($.ID('default',c).abort) {");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    b.append($.T(' Simple Page for customers '));");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','adminaction','text','admin_id','fixed','signin'], function(b,a) {");
    gold.append("\n    b.append($.T(' Sign in for admins '));");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','admin','text','admin_id'], function(b,a) {");
    gold.append("\n    var c = $.aRDp(a, function(vs) { return \"/adminaction/\" + vs['admin_id'] + \"/signin\"; });");
    gold.append("\n    if ($.ID('default',c).abort) {");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    b.append($.T(' Simple Page for admins '));");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','bounce'], function(b,a) {");
    gold.append("\n    var c = $.aRDz('/logingeneric');");
    gold.append("\n    if ($.ID('default',c).abort) {");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n  });");
    gold.append("\n  $.PG(['fixed','logingeneric'], function(b,a) {");
    gold.append("\n    b.append($.T(' Simple Page '));");
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
    source.append("\n    <page uri=\"/customeraction/$customer_id:text/signin\" default-redirect-source>");
    source.append("\n        Sign in for customers");
    source.append("\n    </page>");
    source.append("\n    <page uri=\"/customer/$customer_id:text\" authenticate>");
    source.append("\n        Simple Page for customers");
    source.append("\n    </page>");
    source.append("\n");
    source.append("\n    <page uri=\"/adminaction/$admin_id:text/signin\" default-redirect-source>");
    source.append("\n        Sign in for admins");
    source.append("\n    </page>");
    source.append("\n    <page uri=\"/admin/$admin_id:text\" authenticate>");
    source.append("\n        Simple Page for admins");
    source.append("\n    </page>");
    source.append("\n    <page uri=\"/bounce\" authenticate>");
    source.append("\n");
    source.append("\n    </page>");
    source.append("\n    <page uri=\"/logingeneric\" default-redirect-source>");
    source.append("\n        Simple Page");
    source.append("\n    </page>");
    source.append("\n</forest>");
    return source.toString();
  }
}
