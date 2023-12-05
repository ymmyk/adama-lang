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
package org.adamalang.rxhtml.acl.commands;

import org.adamalang.rxhtml.template.Environment;
import org.adamalang.rxhtml.typing.ViewScope;

/** a simple command to toggle the type of an input box within a password-holder element */
public class TogglePassword  implements Command {
  public TogglePassword() {
  }

  @Override
  public void writeTypes(ViewScope vs) {
  }

  @Override
  public void write(Environment env, String type, String eVar) {
    env.writer.tab().append("$.onPWT(").append(eVar).append(",").append(env.stateVar).append(",'").append(type).append("');").newline();
  }
}
