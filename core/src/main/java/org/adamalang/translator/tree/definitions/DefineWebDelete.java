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
package org.adamalang.translator.tree.definitions;

import org.adamalang.translator.env.Environment;
import org.adamalang.translator.env.FreeEnvironment;
import org.adamalang.translator.parser.token.Token;
import org.adamalang.translator.parser.Formatter;
import org.adamalang.translator.tree.definitions.web.Uri;
import org.adamalang.translator.tree.definitions.web.UriAction;
import org.adamalang.translator.tree.statements.Block;
import org.adamalang.translator.tree.statements.ControlFlow;
import org.adamalang.translator.tree.types.TyType;
import org.adamalang.translator.tree.types.topo.TypeCheckerRoot;

import java.util.TreeMap;
import java.util.function.Consumer;

/** defines a URI to get a web resource */
public class DefineWebDelete extends Definition implements UriAction {

  public final Token webToken;
  public final Token deleteToken;
  public final Uri uri;
  public final Block code;

  public DefineWebDelete(Token webToken, Token deleteToken, Uri uri, Block code) {
    this.webToken = webToken;
    this.deleteToken = deleteToken;
    this.uri = uri;
    this.code = code;
    ingest(webToken);
    ingest(code);
  }

  @Override
  public void emit(Consumer<Token> yielder) {
    yielder.accept(webToken);
    yielder.accept(deleteToken);
    uri.emit(yielder);
    code.emit(yielder);
  }

  @Override
  public void format(Formatter formatter) {
    formatter.startLine(webToken);
    uri.format(formatter);
    code.format(formatter);
  }

  @Override
  public TreeMap<String, TyType> parameters() {
    return uri.variables;
  }

  public Environment next(Environment environment) {
    Environment env = environment.scopeAsAbortable().scopeAsWeb("delete");
    uri.extendInto(env);
    uri.typing(env);
    return env.scopeWithCache("__currentWebCache");
  }

  public void typing(TypeCheckerRoot checker) {
    FreeEnvironment fe = FreeEnvironment.root();
    code.free(fe);
    checker.register(fe.free, (environment) -> {
      Environment env = next(environment);
      if (code.typing(env) == ControlFlow.Open) {
        environment.document.createError(this, String.format("The @web handlers must return a message"));
      }
    });
  }
}
