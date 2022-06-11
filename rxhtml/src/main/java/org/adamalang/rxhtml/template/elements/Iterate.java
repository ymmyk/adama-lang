/*
 * This file is subject to the terms and conditions outlined in the file 'LICENSE' (hint: it's MIT); this file is located in the root directory near the README.md which you should also read.
 *
 * This file is part of the 'Adama' project which is a programming language and document store for board games; however, it can be so much more.
 *
 * See http://www.adama-lang.org/ for more information.
 *
 * (c) 2020 - 2022 by Jeffrey M. Barber (http://jeffrey.io)
 */
package org.adamalang.rxhtml.template.elements;

import org.adamalang.rxhtml.template.Base;
import org.adamalang.rxhtml.template.Environment;

public class Iterate {

  public static void write(Environment env) {
    String setVar = env.pool.ask();
    String gidVar = env.pool.ask();
    env.writer.tab().append("var ").append(gidVar).append(" = $.g();").newline();
    env.writer.tab().append("_.").append(env.name).append(" = {").tabUp().newline();
    env.writer.tab().append("'+': function(").append(setVar).append(") {").tabUp().newline();
    env.writer.tab().append("var _ = {};").newline();
    String appendElement = Base.write(env.current(setVar + ".value").element(env.element).returnVariable(true));
    env.writer.tab().append(appendElement).append("._k = ").append(setVar).append(".key;").newline();
    env.writer.tab().append(setVar).append(".value['").append(setVar).append("_' + ").append(gidVar).append("] = ").append(appendElement).append(";").newline();
    env.pool.give(appendElement);
    env.writer.tab().append("return _;").newline();
    env.writer.tabDown().tab().append("},").newline();
    env.writer.tab().append("'-': function(").append(setVar).append(") {").tabUp().newline();
    env.writer.tab().append("$.n(").append(setVar).append(".before['").append(setVar).append("_' + ").append(gidVar).append("]);").newline();
    env.writer.tabDown().tab().append("},").newline();
    env.writer.tab().append("'^': function(").append(setVar).append(") {").tabUp().newline();
    env.writer.tab().append("$.r(").append(env.parentVariable).append(", ").append(setVar).append(");").newline();
    env.writer.tabDown().tab().append("}").newline();
    env.writer.tabDown().tab().append("}").newline();
    env.pool.give(setVar);
    env.pool.give(gidVar);
  }
}
