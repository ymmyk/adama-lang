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
package org.adamalang.rxhtml.template;

import org.adamalang.rxhtml.atl.Context;
import org.adamalang.rxhtml.codegen.VariablePool;
import org.adamalang.rxhtml.codegen.Writer;
import org.adamalang.rxhtml.template.config.Feedback;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.util.ArrayList;
import java.util.HashMap;

public class Environment {
  public final String section;
  public final Environment parent;
  public final Feedback feedback;
  public final Writer writer;
  public final VariablePool pool;
  public final Element element;
  public final boolean elementAlone;
  public final String parentVariable;
  public final String stateVar;
  public final String caseVar;
  public final String xmlns;
  public final String fragmentFunc;
  private final Context classContext;
  public final ArrayList<Task> tasks;

  private Environment(Environment parent, String section, Context classContext, Feedback feedback, Writer writer, VariablePool pool, Element element, boolean elementAlone, String parentVariable, String stateVar, String caseVar, String xmlns, String fragmentFunc, ArrayList<Task> tasks) {
    this.section = section;
    this.parent = parent;
    this.classContext = classContext;
    this.feedback = feedback;
    this.writer = writer;
    this.pool = pool;
    this.element = element;
    this.elementAlone = elementAlone;
    this.parentVariable = parentVariable;
    this.stateVar = stateVar;
    this.caseVar = caseVar;
    this.xmlns = xmlns;
    this.fragmentFunc = fragmentFunc;
    this.tasks = tasks;
  }

  public static Environment fresh(Feedback feedback) {
    return new Environment(null, "fresh", Context.makeClassContext(), feedback, new Writer(), new VariablePool(), null, false, null, null, null, null, null, new ArrayList<>());
  }

  public HashMap<String, Integer> getCssFreq() {
    return classContext.freq;
  }

  public String val(String name, String defaultVal) {
    if (element.hasAttr(name)) {
      return element.attr(name);
    }
    return defaultVal;
  }

  public Element soloChildIfPossible() {
    Element result = null;
    for (int k = 0; k < element.childNodeSize(); k++) {
      Node node = element.childNode(k);
      if (node instanceof TextNode) {
        TextNode text = (TextNode) node;
        if (!text.text().trim().equalsIgnoreCase("")) {
          return null;
        }
      } else if (node instanceof Comment) {
        // ignore comments
      } else if (node instanceof Element) {
        if (result != null) {
          return null;
        }
        result = (Element) node;
      }
    }
    return result;
  }

  public Environment element(Element element, boolean elementAlone) {
    return new Environment(this, section, classContext, feedback, writer, pool, element, elementAlone, parentVariable, stateVar, caseVar, xmlns, fragmentFunc, tasks);
  }

  public Environment parentVariable(String parentVariable) {
    return new Environment(this, section, classContext, feedback, writer, pool, element, elementAlone, parentVariable, stateVar, caseVar, xmlns, fragmentFunc, tasks);
  }

  public Environment stateVar(String stateVar) {
    return new Environment(this, section, classContext, feedback, writer, pool, element, elementAlone, parentVariable, stateVar, caseVar, xmlns, fragmentFunc, tasks);
  }

  public Environment caseVar(String caseVar) {
    return new Environment(this, section, classContext, feedback, writer, pool, element, elementAlone, parentVariable, stateVar, caseVar, xmlns, fragmentFunc, tasks);
  }

  public Environment xmlns(String xmlns) {
    return new Environment(this, section, classContext, feedback, writer, pool, element, elementAlone, parentVariable, stateVar, caseVar, xmlns, fragmentFunc, tasks);
  }

  public Environment fragmentFunc(String fragmentFunc) {
    return new Environment(this, section, classContext, feedback, writer, pool, element, elementAlone, parentVariable, stateVar, caseVar, xmlns, fragmentFunc, tasks);
  }

  public Environment feedback(String section, Feedback feedback) {
    return new Environment(this, section, classContext, feedback, writer, pool, element, elementAlone, parentVariable, stateVar, caseVar, xmlns, fragmentFunc, tasks);
  }

  public Context contextOf(String attr) {
    if ("class".equals(attr)) {
      return classContext;
    }
    return Context.DEFAULT;
  }
}
