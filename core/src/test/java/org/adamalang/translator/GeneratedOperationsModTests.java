/*
 * This file is subject to the terms and conditions outlined in the file 'LICENSE' (hint: it's MIT); this file is located in the root directory near the README.md which you should also read.
 *
 * This file is part of the 'Adama' project which is a programming language and document store for board games; however, it can be so much more.
 *
 * See https://www.adama-platform.com/ for more information.
 *
 * (c) 2020 - 2022 by Jeffrey M. Barber ( http://jeffrey.io )
 */
package org.adamalang.translator;

import org.junit.Test;

public class GeneratedOperationsModTests extends GeneratedBase {
  private String cached_Formulas_1 = null;
  private String get_Formulas_1() {
    if (cached_Formulas_1 != null) {
      return cached_Formulas_1;
    }
    cached_Formulas_1 = generateTestOutput(true, "Formulas_1", "./test_code/OperationsMod_Formulas_success.a");
    return cached_Formulas_1;
  }

  @Test
  public void testFormulasEmission() {
    assertEmissionGood(get_Formulas_1());
  }

  @Test
  public void testFormulasSuccess() {
    assertLivePass(get_Formulas_1());
  }

  @Test
  public void testFormulasGoodWillHappy() {
    assertGoodWillHappy(get_Formulas_1());
  }

  @Test
  public void testFormulasExceptionFree() {
    assertExceptionFree(get_Formulas_1());
  }

  @Test
  public void testFormulasTODOFree() {
    assertTODOFree(get_Formulas_1());
  }

  @Test
  public void stable_Formulas_1() {
    String live = get_Formulas_1();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:OperationsMod_Formulas_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[]\"--JAVA---------------------------------------------");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.delta.secure.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.algo.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.remote.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport org.adamalang.runtime.sys.*;");
    gold.append("\nimport org.adamalang.runtime.sys.web.*;");
    gold.append("\nimport org.adamalang.runtime.text.*;");
    gold.append("\nimport java.time.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.HashMap;");
    gold.append("\nimport java.util.HashSet;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.util.Set;");
    gold.append("\npublic class Formulas_1 extends LivingDocument {");
    gold.append("\n  private final RxLazy<NtMaybe<Integer>> f0;");
    gold.append("\n  private final RxLazy<NtMaybe<Integer>> f1;");
    gold.append("\n  private final RxLazy<NtMaybe<Long>> f2;");
    gold.append("\n  private final RxLazy<NtMaybe<Long>> f3;");
    gold.append("\n  private final RxLazy<NtMaybe<Long>> f4;");
    gold.append("\n  private final RxLazy<NtMaybe<Long>> f5;");
    gold.append("\n  private final RxLazy<NtMaybe<Long>> f6;");
    gold.append("\n  @Override");
    gold.append("\n  public long __memory() {");
    gold.append("\n    long __sum = super.__memory();");
    gold.append("\n    __sum += f0.__memory();");
    gold.append("\n    __sum += f1.__memory();");
    gold.append("\n    __sum += f2.__memory();");
    gold.append("\n    __sum += f3.__memory();");
    gold.append("\n    __sum += f4.__memory();");
    gold.append("\n    __sum += f5.__memory();");
    gold.append("\n    __sum += f6.__memory();");
    gold.append("\n    return __sum;");
    gold.append("\n  }");
    gold.append("\n  public Formulas_1(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    f0 = new RxLazy<NtMaybe<Integer>>(this, () -> (LibArithmetic.Mod.O(1, 1)));");
    gold.append("\n    f1 = new RxLazy<NtMaybe<Integer>>(this, () -> (LibArithmetic.Mod.O(1, 0)));");
    gold.append("\n    f2 = new RxLazy<NtMaybe<Long>>(this, () -> (LibArithmetic.Mod.O(1L, 1)));");
    gold.append("\n    f3 = new RxLazy<NtMaybe<Long>>(this, () -> (LibArithmetic.Mod.O(1L, 0)));");
    gold.append("\n    f4 = new RxLazy<NtMaybe<Long>>(this, () -> (LibArithmetic.Mod.O(1L, 1L)));");
    gold.append("\n    f5 = new RxLazy<NtMaybe<Long>>(this, () -> (LibArithmetic.Mod.O(1L, 1L)));");
    gold.append("\n    f6 = new RxLazy<NtMaybe<Long>>(this, () -> (LibArithmetic.Mod.O(1L, 0L)));");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__last_expire_time\":");
    gold.append("\n            __last_expire_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_table_row_id\":");
    gold.append("\n            __auto_table_row_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_gen\":");
    gold.append("\n            __auto_gen.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_cache_id\":");
    gold.append("\n            __auto_cache_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__cache\":");
    gold.append("\n            __cache.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__dedupe\":");
    gold.append("\n            __hydrateDeduper(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__timeouts\":");
    gold.append("\n            __hydrateTimeouts(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __patch(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__last_expire_time\":");
    gold.append("\n            __last_expire_time.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_table_row_id\":");
    gold.append("\n            __auto_table_row_id.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_gen\":");
    gold.append("\n            __auto_gen.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_cache_id\":");
    gold.append("\n            __auto_cache_id.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__cache\":");
    gold.append("\n            __cache.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__dedupe\":");
    gold.append("\n            __hydrateDeduper(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__timeouts\":");
    gold.append("\n            __hydrateTimeouts(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__last_expire_time\");");
    gold.append("\n    __last_expire_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_table_row_id\");");
    gold.append("\n    __auto_table_row_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_gen\");");
    gold.append("\n    __auto_gen.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_cache_id\");");
    gold.append("\n    __auto_cache_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__cache\");");
    gold.append("\n    __cache.__dump(__writer);");
    gold.append("\n    __dumpDeduper(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __dumpTimeouts(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __last_expire_time.__commit(\"__last_expire_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    __auto_table_row_id.__commit(\"__auto_table_row_id\", __forward, __reverse);");
    gold.append("\n    __auto_gen.__commit(\"__auto_gen\", __forward, __reverse);");
    gold.append("\n    __auto_cache_id.__commit(\"__auto_cache_id\", __forward, __reverse);");
    gold.append("\n    __cache.__commit(\"__cache\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __last_expire_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    __auto_table_row_id.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaFormulas_1 implements DeltaNode {");
    gold.append("\n    private int __gf0;");
    gold.append("\n    private DMaybe<DInt32> __df0;");
    gold.append("\n    private int __gf1;");
    gold.append("\n    private DMaybe<DInt32> __df1;");
    gold.append("\n    private int __gf2;");
    gold.append("\n    private DMaybe<DInt64> __df2;");
    gold.append("\n    private int __gf3;");
    gold.append("\n    private DMaybe<DInt64> __df3;");
    gold.append("\n    private int __gf4;");
    gold.append("\n    private DMaybe<DInt64> __df4;");
    gold.append("\n    private int __gf5;");
    gold.append("\n    private DMaybe<DInt64> __df5;");
    gold.append("\n    private int __gf6;");
    gold.append("\n    private DMaybe<DInt64> __df6;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaFormulas_1() {");
    gold.append("\n      __gf0 = -1;");
    gold.append("\n      __df0 = new DMaybe<DInt32>();");
    gold.append("\n      __gf1 = -1;");
    gold.append("\n      __df1 = new DMaybe<DInt32>();");
    gold.append("\n      __gf2 = -1;");
    gold.append("\n      __df2 = new DMaybe<DInt64>();");
    gold.append("\n      __gf3 = -1;");
    gold.append("\n      __df3 = new DMaybe<DInt64>();");
    gold.append("\n      __gf4 = -1;");
    gold.append("\n      __df4 = new DMaybe<DInt64>();");
    gold.append("\n      __gf5 = -1;");
    gold.append("\n      __df5 = new DMaybe<DInt64>();");
    gold.append("\n      __gf6 = -1;");
    gold.append("\n      __df6 = new DMaybe<DInt64>();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      __sum += __df0.__memory();");
    gold.append("\n      __sum += __df1.__memory();");
    gold.append("\n      __sum += __df2.__memory();");
    gold.append("\n      __sum += __df3.__memory();");
    gold.append("\n      __sum += __df4.__memory();");
    gold.append("\n      __sum += __df5.__memory();");
    gold.append("\n      __sum += __df6.__memory();");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(Formulas_1 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 7;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__gf0 != __item.f0.getGeneration()) {");
    gold.append("\n        if (__item.f0.get().has()) {");
    gold.append("\n          Integer __maybeElement0 = (Integer)(__item.f0.get().get());");
    gold.append("\n          DInt32 __maybeDeltaElement1 = __df0.get(() -> new DInt32());");
    gold.append("\n          __maybeDeltaElement1.show(__maybeElement0, __obj.planField(\"f0\"));");
    gold.append("\n        } else {");
    gold.append("\n          __df0.hide(__obj.planField(\"f0\"));");
    gold.append("\n        }");
    gold.append("\n        __gf0 = __item.f0.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gf1 != __item.f1.getGeneration()) {");
    gold.append("\n        if (__item.f1.get().has()) {");
    gold.append("\n          Integer __maybeElement2 = (Integer)(__item.f1.get().get());");
    gold.append("\n          DInt32 __maybeDeltaElement3 = __df1.get(() -> new DInt32());");
    gold.append("\n          __maybeDeltaElement3.show(__maybeElement2, __obj.planField(\"f1\"));");
    gold.append("\n        } else {");
    gold.append("\n          __df1.hide(__obj.planField(\"f1\"));");
    gold.append("\n        }");
    gold.append("\n        __gf1 = __item.f1.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gf2 != __item.f2.getGeneration()) {");
    gold.append("\n        if (__item.f2.get().has()) {");
    gold.append("\n          Long __maybeElement4 = (Long)(__item.f2.get().get());");
    gold.append("\n          DInt64 __maybeDeltaElement5 = __df2.get(() -> new DInt64());");
    gold.append("\n          __maybeDeltaElement5.show(__maybeElement4, __obj.planField(\"f2\"));");
    gold.append("\n        } else {");
    gold.append("\n          __df2.hide(__obj.planField(\"f2\"));");
    gold.append("\n        }");
    gold.append("\n        __gf2 = __item.f2.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gf3 != __item.f3.getGeneration()) {");
    gold.append("\n        if (__item.f3.get().has()) {");
    gold.append("\n          Long __maybeElement6 = (Long)(__item.f3.get().get());");
    gold.append("\n          DInt64 __maybeDeltaElement7 = __df3.get(() -> new DInt64());");
    gold.append("\n          __maybeDeltaElement7.show(__maybeElement6, __obj.planField(\"f3\"));");
    gold.append("\n        } else {");
    gold.append("\n          __df3.hide(__obj.planField(\"f3\"));");
    gold.append("\n        }");
    gold.append("\n        __gf3 = __item.f3.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gf4 != __item.f4.getGeneration()) {");
    gold.append("\n        if (__item.f4.get().has()) {");
    gold.append("\n          Long __maybeElement8 = (Long)(__item.f4.get().get());");
    gold.append("\n          DInt64 __maybeDeltaElement9 = __df4.get(() -> new DInt64());");
    gold.append("\n          __maybeDeltaElement9.show(__maybeElement8, __obj.planField(\"f4\"));");
    gold.append("\n        } else {");
    gold.append("\n          __df4.hide(__obj.planField(\"f4\"));");
    gold.append("\n        }");
    gold.append("\n        __gf4 = __item.f4.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gf5 != __item.f5.getGeneration()) {");
    gold.append("\n        if (__item.f5.get().has()) {");
    gold.append("\n          Long __maybeElement10 = (Long)(__item.f5.get().get());");
    gold.append("\n          DInt64 __maybeDeltaElement11 = __df5.get(() -> new DInt64());");
    gold.append("\n          __maybeDeltaElement11.show(__maybeElement10, __obj.planField(\"f5\"));");
    gold.append("\n        } else {");
    gold.append("\n          __df5.hide(__obj.planField(\"f5\"));");
    gold.append("\n        }");
    gold.append("\n        __gf5 = __item.f5.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gf6 != __item.f6.getGeneration()) {");
    gold.append("\n        if (__item.f6.get().has()) {");
    gold.append("\n          Long __maybeElement12 = (Long)(__item.f6.get().get());");
    gold.append("\n          DInt64 __maybeDeltaElement13 = __df6.get(() -> new DInt64());");
    gold.append("\n          __maybeDeltaElement13.show(__maybeElement12, __obj.planField(\"f6\"));");
    gold.append("\n        } else {");
    gold.append("\n          __df6.hide(__obj.planField(\"f6\"));");
    gold.append("\n        }");
    gold.append("\n        __gf6 = __item.f6.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void clear() {");
    gold.append("\n      __df0.clear();");
    gold.append("\n      __df1.clear();");
    gold.append("\n      __df2.clear();");
    gold.append("\n      __df3.clear();");
    gold.append("\n      __df4.clear();");
    gold.append("\n      __df5.clear();");
    gold.append("\n      __df6.clear();");
    gold.append("\n      __code_cost += 7;");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        clear();");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public Set<String> __get_intern_strings() {");
    gold.append("\n    HashSet<String> __interns = new HashSet<>();");
    gold.append("\n    __interns.add(\"\");");
    gold.append("\n    __interns.add(\"?\");");
    gold.append("\n    return __interns;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtPrincipal __who, Perspective ___perspective, AssetIdEncoder __encoder) {");
    gold.append("\n    Formulas_1 __self = this;");
    gold.append("\n    DeltaFormulas_1 __state = new DeltaFormulas_1();");
    gold.append("\n    RTx__ViewerType __viewerState = new RTx__ViewerType();");
    gold.append("\n    return new PrivateView(__who, ___perspective, __encoder) {");
    gold.append("\n      @Override");
    gold.append("\n      public long memory() {");
    gold.append("\n        return __state.__memory();");
    gold.append("\n      }");
    gold.append("\n      @Override");
    gold.append("\n      public void dumpViewer(JsonStreamWriter __writer) {");
    gold.append("\n        __viewerState.__writeOut(__writer);");
    gold.append("\n      }");
    gold.append("\n      @Override");
    gold.append("\n      public void ingest(JsonStreamReader __reader) {");
    gold.append("\n        __viewerState.__ingest(__reader);");
    gold.append("\n      }");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer, __viewerState, __encoder));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTx__ViewerType extends NtMessageBase {");
    gold.append("\n    public void __hash(HashBuilder __hash) {");
    gold.append("\n      __hash.hashString(\"anonymous\");");
    gold.append("\n    }");
    gold.append("\n    private RTx__ViewerType(JsonStreamReader __reader) {");
    gold.append("\n      __ingest(__reader);");
    gold.append("\n    }");
    gold.append("\n    public int __DATA_GENERATION = 1;");
    gold.append("\n    @Override");
    gold.append("\n    public void __ingest(JsonStreamReader __reader) {");
    gold.append("\n      __reader.mustSkipObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTx__ViewerType() {}");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTx__ViewerType implements DeltaNode {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTx__ViewerType() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTx__ViewerType __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void clear() {");
    gold.append("\n      __code_cost += 0;");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        clear();");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  public static HashMap<String, HashMap<String, Object>> __services() {");
    gold.append("\n    HashMap<String, HashMap<String, Object>> __map = new HashMap<>();");
    gold.append("\n    return __map;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __link(ServiceRegistry __registry) {}");
    gold.append("\n  @Override");
    gold.append("\n  public void __executeServiceCalls(boolean cancel) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected boolean __is_direct_channel(String channel) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __handle_direct(CoreRequestContext context, String channel, Object __message) throws AbortMessageException {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public WebResponse __get(WebGet __request) {");
    gold.append("\n    WebPath __path = new WebPath(__request.uri);");
    gold.append("\n    return null;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected WebResponse __put_internal(WebPut __request) {");
    gold.append("\n    WebPath __path = new WebPath(__request.uri);");
    gold.append("\n    return null;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected WebResponse __delete_internal(WebDelete __request) {");
    gold.append("\n    WebPath __path = new WebPath(__request.uri);");
    gold.append("\n    return null;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public WebResponse __options(WebGet __request) {");
    gold.append("\n    WebPath __path = new WebPath(__request.uri);");
    gold.append("\n    return null;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  public static boolean __onCanCreate(CoreRequestContext __context) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  public static boolean __onCanInvent(CoreRequestContext __context) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  public static boolean __onCanSendWhileDisconnected(CoreRequestContext __context) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onLoad() {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onCanAssetAttached(CoreRequestContext __cvalue) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onAssetAttached(CoreRequestContext __cvalue, NtAsset __pvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __delete(CoreRequestContext __cvalue) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(CoreRequestContext __cvalue) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(CoreRequestContext __cvalue) {}");
    gold.append("\n  public static HashMap<String, Object> __config() {");
    gold.append("\n    HashMap<String, Object> __map = new HashMap<>();");
    gold.append("\n    return __map;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(CoreRequestContext _c, NtMessageBase _m) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\nBegin");
    gold.append("\nEnd");
    gold.append("\n--REFLECTION RESULTS-------------------------------------");
    gold.append("\n{\"types\":{\"__Root\":{\"nature\":\"reactive_record\",\"name\":\"Root\",\"fields\":{\"f0\":{\"type\":{\"nature\":\"native_maybe\",\"type\":{\"nature\":\"native_value\",\"type\":\"int\"}},\"privacy\":\"public\"},\"f1\":{\"type\":{\"nature\":\"native_maybe\",\"type\":{\"nature\":\"native_value\",\"type\":\"int\"}},\"privacy\":\"public\"},\"f2\":{\"type\":{\"nature\":\"native_maybe\",\"type\":{\"nature\":\"native_value\",\"type\":\"long\"}},\"privacy\":\"public\"},\"f3\":{\"type\":{\"nature\":\"native_maybe\",\"type\":{\"nature\":\"native_value\",\"type\":\"long\"}},\"privacy\":\"public\"},\"f4\":{\"type\":{\"nature\":\"native_maybe\",\"type\":{\"nature\":\"native_value\",\"type\":\"long\"}},\"privacy\":\"public\"},\"f5\":{\"type\":{\"nature\":\"native_maybe\",\"type\":{\"nature\":\"native_value\",\"type\":\"long\"}},\"privacy\":\"public\"},\"f6\":{\"type\":{\"nature\":\"native_maybe\",\"type\":{\"nature\":\"native_value\",\"type\":\"long\"}},\"privacy\":\"public\"}}},\"__ViewerType\":{\"nature\":\"native_message\",\"name\":\"__ViewerType\",\"anonymous\":true,\"fields\":{}}},\"channels\":{},\"constructors\":[],\"labels\":[]}");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\",\"key\":\"0\",\"origin\":\"origin\",\"ip\":\"ip\"}-->{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__messages\":null,\"__seq\":1} need:false in:0");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":2,\"__entropy\":\"4804307197456638271\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\nCPU:0");
    gold.append("\nMEMORY:664");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"50\"}-->{\"__messages\":null,\"__seq\":3,\"__entropy\":\"-1034601897293430941\",\"__time\":\"50\"} need:false in:-50");
    gold.append("\nNO_ONE: CREATED PRIVATE VIEW");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"f0\":0,\"f2\":\"0\",\"f4\":\"0\",\"f5\":\"0\"},\"seq\":3}");
    gold.append("\nNO_ONE|FAILURE:184333");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"75\"}-->{\"__messages\":null,\"__seq\":4,\"__entropy\":\"7848011421992302230\",\"__time\":\"75\"} need:false in:-75");
    gold.append("\nRANDO: CREATED PRIVATE VIEW");
    gold.append("\n+ NO_ONE DELTA:{\"seq\":4}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"f0\":0,\"f2\":\"0\",\"f4\":\"0\",\"f5\":\"0\"},\"seq\":4}");
    gold.append("\nRANDO|FAILURE:184333");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"100\"}-->{\"__messages\":null,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__time\":\"100\"} need:false in:-100");
    gold.append("\nRANDO|SUCCESS:5");
    gold.append("\n+ NO_ONE DELTA:{\"seq\":5}");
    gold.append("\n+ RANDO DELTA:{\"seq\":5}");
    gold.append("\nMEMORY:1662");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__last_expire_time\":\"0\",\"__blocked\":false,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"100\",\"__auto_table_row_id\":0,\"__auto_gen\":0,\"__auto_cache_id\":0,\"__cache\":{}}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__last_expire_time\":\"0\",\"__blocked\":false,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"100\",\"__auto_table_row_id\":0,\"__auto_gen\":0,\"__auto_cache_id\":0,\"__cache\":{}}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__last_expire_time\":\"0\",\"__blocked\":false,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"100\",\"__auto_table_row_id\":0,\"__auto_gen\":0,\"__auto_cache_id\":0,\"__cache\":{}}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
}
