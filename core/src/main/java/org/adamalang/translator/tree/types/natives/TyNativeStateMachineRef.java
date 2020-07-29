/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.translator.tree.types.natives;

import java.util.function.Consumer;
import org.adamalang.translator.env.Environment;
import org.adamalang.translator.parser.token.Token;
import org.adamalang.translator.tree.common.DocumentPosition;
import org.adamalang.translator.tree.expressions.Expression;
import org.adamalang.translator.tree.expressions.constants.StateMachineConstant;
import org.adamalang.translator.tree.types.TySimpleNative;
import org.adamalang.translator.tree.types.TyType;
import org.adamalang.translator.tree.types.TypeBehavior;
import org.adamalang.translator.tree.types.traits.IsNativeValue;
import org.adamalang.translator.tree.types.traits.assign.AssignmentViaNative;
import org.adamalang.translator.tree.types.traits.details.DetailEqualityTestingRequiresWrapping;
import org.adamalang.translator.tree.types.traits.details.DetailHasDeltaType;

/** The type representing a valid reference in the state machine; this uses the
 * native 'String' java type */
public class TyNativeStateMachineRef extends TySimpleNative implements //
    IsNativeValue, //
    DetailHasDeltaType, //
    DetailEqualityTestingRequiresWrapping, //
    AssignmentViaNative //
{
  public final Token token;

  public TyNativeStateMachineRef(final TypeBehavior behavior, final Token token) {
    super(behavior, "String", "String");
    this.token = token;
    ingest(token);
  }

  @Override
  public void emit(final Consumer<Token> yielder) {
    yielder.accept(token);
  }

  @Override
  public String getAdamaType() {
    return "label";
  }

  @Override
  public String getDeltaType(final Environment environment) {
    return "DFastString";
  }

  @Override
  public String getEqualityTestingBinaryPattern() {
    return "LibString.equality(%s, %s)";
  }

  @Override
  public Expression inventDefaultValueExpression(final DocumentPosition forWhatExpression) {
    return new StateMachineConstant(Token.WRAP("#")).withPosition(forWhatExpression);
  }

  @Override
  public TyType makeCopyWithNewPosition(final DocumentPosition position, final TypeBehavior newBehavior) {
    return new TyNativeStateMachineRef(newBehavior, token).withPosition(position);
  }
}