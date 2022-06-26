/*
 * This file is subject to the terms and conditions outlined in the file 'LICENSE' (hint: it's MIT); this file is located in the root directory near the README.md which you should also read.
 *
 * This file is part of the 'Adama' project which is a programming language and document store for board games; however, it can be so much more.
 *
 * See http://www.adama-lang.org/ for more information.
 *
 * (c) 2020 - 2022 by Jeffrey M. Barber (http://jeffrey.io)
 */
package org.adamalang.translator;

import org.junit.Test;

public class GeneratedConversionTests extends GeneratedBase {
  private String cached_CantConvertIntList_1 = null;
  private String get_CantConvertIntList_1() {
    if (cached_CantConvertIntList_1 != null) {
      return cached_CantConvertIntList_1;
    }
    cached_CantConvertIntList_1 = generateTestOutput(false, "CantConvertIntList_1", "./test_code/Conversion_CantConvertIntList_failure.a");
    return cached_CantConvertIntList_1;
  }

  @Test
  public void testCantConvertIntListFailure() {
    assertLiveFail(get_CantConvertIntList_1());
  }

  @Test
  public void testCantConvertIntListNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_CantConvertIntList_1());
  }

  @Test
  public void testCantConvertIntListExceptionFree() {
    assertExceptionFree(get_CantConvertIntList_1());
  }

  @Test
  public void testCantConvertIntListTODOFree() {
    assertTODOFree(get_CantConvertIntList_1());
  }

  @Test
  public void stable_CantConvertIntList_1() {
    String live = get_CantConvertIntList_1();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Conversion_CantConvertIntList_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[{\"range\":{\"start\":{\"line\":4,\"character\":22},\"end\":{\"line\":4,\"character\":31}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type `int[]` is unable to be converted. Only list<S>, S[], maybe<S> can be converted where S is either a record or a message. (TypeCheckFailures)\"}]\"--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_CantConvertListToList_2 = null;
  private String get_CantConvertListToList_2() {
    if (cached_CantConvertListToList_2 != null) {
      return cached_CantConvertListToList_2;
    }
    cached_CantConvertListToList_2 = generateTestOutput(false, "CantConvertListToList_2", "./test_code/Conversion_CantConvertListToList_failure.a");
    return cached_CantConvertListToList_2;
  }

  @Test
  public void testCantConvertListToListFailure() {
    assertLiveFail(get_CantConvertListToList_2());
  }

  @Test
  public void testCantConvertListToListNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_CantConvertListToList_2());
  }

  @Test
  public void testCantConvertListToListExceptionFree() {
    assertExceptionFree(get_CantConvertListToList_2());
  }

  @Test
  public void testCantConvertListToListTODOFree() {
    assertTODOFree(get_CantConvertListToList_2());
  }

  @Test
  public void stable_CantConvertListToList_2() {
    String live = get_CantConvertListToList_2();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Conversion_CantConvertListToList_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[{\"range\":{\"start\":{\"line\":12,\"character\":2},\"end\":{\"line\":12,\"character\":8}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type 'list<M>' is unable to store type 'M[]'. (TypeCheckReferences)\"}]\"--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_CantInteger_3 = null;
  private String get_CantInteger_3() {
    if (cached_CantInteger_3 != null) {
      return cached_CantInteger_3;
    }
    cached_CantInteger_3 = generateTestOutput(false, "CantInteger_3", "./test_code/Conversion_CantInteger_failure.a");
    return cached_CantInteger_3;
  }

  @Test
  public void testCantIntegerFailure() {
    assertLiveFail(get_CantInteger_3());
  }

  @Test
  public void testCantIntegerNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_CantInteger_3());
  }

  @Test
  public void testCantIntegerExceptionFree() {
    assertExceptionFree(get_CantInteger_3());
  }

  @Test
  public void testCantIntegerTODOFree() {
    assertTODOFree(get_CantInteger_3());
  }

  @Test
  public void stable_CantInteger_3() {
    String live = get_CantInteger_3();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Conversion_CantInteger_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[{\"range\":{\"start\":{\"line\":4,\"character\":22},\"end\":{\"line\":4,\"character\":23}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type `int` is unable to be converted. Only list<S>, S[], maybe<S> can be converted where S is either a record or a message. (TypeCheckFailures)\"}]\"--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_CantMaybeInteger_4 = null;
  private String get_CantMaybeInteger_4() {
    if (cached_CantMaybeInteger_4 != null) {
      return cached_CantMaybeInteger_4;
    }
    cached_CantMaybeInteger_4 = generateTestOutput(false, "CantMaybeInteger_4", "./test_code/Conversion_CantMaybeInteger_failure.a");
    return cached_CantMaybeInteger_4;
  }

  @Test
  public void testCantMaybeIntegerFailure() {
    assertLiveFail(get_CantMaybeInteger_4());
  }

  @Test
  public void testCantMaybeIntegerNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_CantMaybeInteger_4());
  }

  @Test
  public void testCantMaybeIntegerExceptionFree() {
    assertExceptionFree(get_CantMaybeInteger_4());
  }

  @Test
  public void testCantMaybeIntegerTODOFree() {
    assertTODOFree(get_CantMaybeInteger_4());
  }

  @Test
  public void stable_CantMaybeInteger_4() {
    String live = get_CantMaybeInteger_4();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Conversion_CantMaybeInteger_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[{\"range\":{\"start\":{\"line\":4,\"character\":29},\"end\":{\"line\":4,\"character\":30}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: must have a type of 'record' or 'message', but got a type of 'int'. (RuleSetStructures)\"},{\"range\":{\"start\":{\"line\":4,\"character\":22},\"end\":{\"line\":4,\"character\":30}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type `maybe<int>` is unable to be converted. Only list<S>, S[], maybe<S> can be converted where S is either a record or a message. (TypeCheckFailures)\"}]\"--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_Legacy_5 = null;
  private String get_Legacy_5() {
    if (cached_Legacy_5 != null) {
      return cached_Legacy_5;
    }
    cached_Legacy_5 = generateTestOutput(true, "Legacy_5", "./test_code/Conversion_Legacy_success.a");
    return cached_Legacy_5;
  }

  @Test
  public void testLegacyEmission() {
    assertEmissionGood(get_Legacy_5());
  }

  @Test
  public void testLegacySuccess() {
    assertLivePass(get_Legacy_5());
  }

  @Test
  public void testLegacyGoodWillHappy() {
    assertGoodWillHappy(get_Legacy_5());
  }

  @Test
  public void testLegacyExceptionFree() {
    assertExceptionFree(get_Legacy_5());
  }

  @Test
  public void testLegacyTODOFree() {
    assertTODOFree(get_Legacy_5());
  }

  @Test
  public void stable_Legacy_5() {
    String live = get_Legacy_5();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Conversion_Legacy_success.a");
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
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport org.adamalang.runtime.sys.*;");
    gold.append("\nimport org.adamalang.runtime.sys.web.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.HashMap;");
    gold.append("\nimport java.util.HashSet;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.util.Set;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Legacy_5 extends LivingDocument {");
    gold.append("\n  private final RxTable<RTxZ> tbl;");
    gold.append("\n  private final RTxZ cake;");
    gold.append("\n  @Override");
    gold.append("\n  public long __memory() {");
    gold.append("\n    long __sum = super.__memory();");
    gold.append("\n    __sum += tbl.__memory();");
    gold.append("\n    __sum += cake.__memory();");
    gold.append("\n    return __sum;");
    gold.append("\n  }");
    gold.append("\n  public Legacy_5(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    tbl = new RxTable<>(__self, this, \"tbl\", (RxParent __parent) -> new RTxZ(__parent), 0);");
    gold.append("\n    cake = new RTxZ(this);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"tbl\":");
    gold.append("\n            tbl.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"cake\":");
    gold.append("\n            cake.__insert(__reader);");
    gold.append("\n            break;");
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
    gold.append("\n          case \"__dedupe\":");
    gold.append("\n            __hydrateDeduper(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
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
    gold.append("\n          case \"tbl\":");
    gold.append("\n            tbl.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"cake\":");
    gold.append("\n            cake.__patch(__reader);");
    gold.append("\n            break;");
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
    gold.append("\n          case \"__dedupe\":");
    gold.append("\n            __hydrateDeduper(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
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
    gold.append("\n    __writer.writeObjectFieldIntro(\"tbl\");");
    gold.append("\n    tbl.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"cake\");");
    gold.append("\n    cake.__dump(__writer);");
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
    gold.append("\n    __dumpDeduper(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
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
    gold.append("\n    tbl.__commit(\"tbl\", __forward, __reverse);");
    gold.append("\n    cake.__commit(\"cake\", __forward, __reverse);");
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
    gold.append("\n    tbl.__revert();");
    gold.append("\n    cake.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaLegacy_5 implements DeltaNode {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaLegacy_5() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(Legacy_5 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
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
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Perspective ___perspective, AssetIdEncoder __encoder) {");
    gold.append("\n    Legacy_5 __self = this;");
    gold.append("\n    DeltaLegacy_5 __state = new DeltaLegacy_5();");
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
    gold.append("\n  private static class RTx__ViewerType implements NtMessageBase {");
    gold.append("\n    private RTx__ViewerType(JsonStreamReader __reader) {");
    gold.append("\n      __ingest(__reader);");
    gold.append("\n    }");
    gold.append("\n    public int __DATA_GENERATION = 1;");
    gold.append("\n    private void __ingest(JsonStreamReader __reader) {");
    gold.append("\n      __reader.skipValue();");
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
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTxX implements NtMessageBase {");
    gold.append("\n    private int a = 0;");
    gold.append("\n    private RTxX(JsonStreamReader __reader) {");
    gold.append("\n      __ingest(__reader);");
    gold.append("\n    }");
    gold.append("\n    private void __ingest(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"a\":");
    gold.append("\n              this.a = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"a\");");
    gold.append("\n      __writer.writeInteger(a);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxX() {}");
    gold.append("\n    private RTxX(int a) {");
    gold.append("\n      this.a = a;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX implements DeltaNode {");
    gold.append("\n    private DInt32 __da;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __da = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      __sum += __da.__memory();");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __da.show(__item.a, __obj.planField(\"a\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTxY implements NtMessageBase {");
    gold.append("\n    private int a = 0;");
    gold.append("\n    private int b = 0;");
    gold.append("\n    private RTxY(JsonStreamReader __reader) {");
    gold.append("\n      __ingest(__reader);");
    gold.append("\n    }");
    gold.append("\n    private void __ingest(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"a\":");
    gold.append("\n              this.a = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            case \"b\":");
    gold.append("\n              this.b = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"a\");");
    gold.append("\n      __writer.writeInteger(a);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"b\");");
    gold.append("\n      __writer.writeInteger(b);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxY() {}");
    gold.append("\n    private RTxY(int a, int b) {");
    gold.append("\n      this.a = a;");
    gold.append("\n      this.b = b;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxY implements DeltaNode {");
    gold.append("\n    private DInt32 __da;");
    gold.append("\n    private DInt32 __db;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxY() {");
    gold.append("\n      __da = new DInt32();");
    gold.append("\n      __db = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      __sum += __da.__memory();");
    gold.append("\n      __sum += __db.__memory();");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxY __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __da.show(__item.a, __obj.planField(\"a\"));");
    gold.append("\n      __db.show(__item.b, __obj.planField(\"b\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static String[] __INDEX_COLUMNS_Z = new String[] {\"a\", \"b\", \"c\"};");
    gold.append("\n  private class RTxZ extends RxRecordBase<RTxZ> {");
    gold.append("\n    private final RxInt32 a;");
    gold.append("\n    private final RxInt32 b;");
    gold.append("\n    private final RxInt32 c;");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxZ(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      a = new RxInt32(this, 0);");
    gold.append("\n      b = new RxInt32(this, 0);");
    gold.append("\n      c = new RxInt32(this, 0);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = super.__memory();");
    gold.append("\n      __sum += a.__memory();");
    gold.append("\n      __sum += b.__memory();");
    gold.append("\n      __sum += c.__memory();");
    gold.append("\n      __sum += id.__memory();");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS_Z;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {a.getIndexValue(), b.getIndexValue(), c.getIndexValue()};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"a\":");
    gold.append("\n              a.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"b\":");
    gold.append("\n              b.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"c\":");
    gold.append("\n              c.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __patch(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"a\":");
    gold.append("\n              a.__patch(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"b\":");
    gold.append("\n              b.__patch(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"c\":");
    gold.append("\n              c.__patch(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__patch(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"a\");");
    gold.append("\n      a.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"b\");");
    gold.append("\n      b.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"c\");");
    gold.append("\n      c.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        a.__commit(\"a\", __forward, __reverse);");
    gold.append("\n        b.__commit(\"b\", __forward, __reverse);");
    gold.append("\n        c.__commit(\"c\", __forward, __reverse);");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        a.__revert();");
    gold.append("\n        b.__revert();");
    gold.append("\n        c.__revert();");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"Z\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxZ implements DeltaNode {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxZ() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxZ __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTxAutoMaxRecord2 implements NtMessageBase {");
    gold.append("\n    private int a = 0;");
    gold.append("\n    private int b = 0;");
    gold.append("\n    private int c = 0;");
    gold.append("\n    private RTxAutoMaxRecord2(JsonStreamReader __reader) {");
    gold.append("\n      __ingest(__reader);");
    gold.append("\n    }");
    gold.append("\n    private void __ingest(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"a\":");
    gold.append("\n              this.a = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            case \"b\":");
    gold.append("\n              this.b = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            case \"c\":");
    gold.append("\n              this.c = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"a\");");
    gold.append("\n      __writer.writeInteger(a);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"b\");");
    gold.append("\n      __writer.writeInteger(b);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"c\");");
    gold.append("\n      __writer.writeInteger(c);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxAutoMaxRecord2() {}");
    gold.append("\n    private RTxAutoMaxRecord2(int a, int b, int c) {");
    gold.append("\n      this.a = a;");
    gold.append("\n      this.b = b;");
    gold.append("\n      this.c = c;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxAutoMaxRecord2 implements DeltaNode {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxAutoMaxRecord2() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxAutoMaxRecord2 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected boolean __is_direct_channel(String channel) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __handle_direct(NtClient who, String channel, Object __message) throws AbortMessageException {");
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
    gold.append("\n  public WebResponse __get(NtClient __who, WebGet __request) {");
    gold.append("\n    return null;");
    gold.append("\n  }");
    gold.append("\n  private void __step_setup() {");
    gold.append("\n    __code_cost += 7;");
    gold.append("\n    __track(0);");
    gold.append("\n    RTxX[] x1 = Utility.convertMultiple(Utility.convertMultiple(new RTxAutoMaxRecord2[] {new RTxAutoMaxRecord2(1, 2, 3)}, (__n) -> new RTxY[__n], (__obj) -> new RTxY(__obj.a, __obj.b)), (__n) -> new RTxX[__n], (__obj) -> new RTxX(__obj.a));");
    gold.append("\n    __track(1);");
    gold.append("\n    RTxX[] x2 = Utility.convertMultiple(tbl.iterate(true), (__n) -> new RTxX[__n], (__obj) -> new RTxX(__obj.a.get()));");
    gold.append("\n    __track(2);");
    gold.append("\n    RTxX[] x3 = Utility.convertMultiple((tbl.iterate(true)).toArray((Integer __n) -> (Object) (new RTxZ[__n])), (__n) -> new RTxX[__n], (__obj) -> new RTxX(__obj.a.get()));");
    gold.append("\n    __track(3);");
    gold.append("\n    RTxY[] y1 = Utility.convertMultiple(tbl.iterate(true), (__n) -> new RTxY[__n], (__obj) -> new RTxY(__obj.a.get(), __obj.b.get()));");
    gold.append("\n    __track(4);");
    gold.append("\n    RTxY[] y2 = Utility.convertMultiple((tbl.iterate(true)).toArray((Integer __n) -> (Object) (new RTxZ[__n])), (__n) -> new RTxY[__n], (__obj) -> new RTxY(__obj.a.get(), __obj.b.get()));");
    gold.append("\n    __track(5);");
    gold.append("\n    final RTxY y = Utility.convertSingle(cake, (__obj) -> new RTxY(__obj.a.get(), __obj.b.get()));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"setup\":");
    gold.append("\n        __step_setup();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
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
    gold.append("\n  public boolean __onCanAssetAttached(NtClient __cvalue) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onAssetAttached(NtClient __cvalue, NtAsset __pvalue) {");
    gold.append("\n");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {");
    gold.append("\n");
    gold.append("\n  }");
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
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(6);");
    gold.append("\n    __transitionStateMachine(\"setup\", 0);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\nBegin");
    gold.append("\nEnd");
    gold.append("\n--REFLECTION RESULTS-------------------------------------");
    gold.append("\n{\"types\":{\"#root\":{\"nature\":\"reactive_record\",\"name\":\"Root\",\"fields\":{}},\"__ViewerType\":{\"nature\":\"native_message\",\"name\":\"__ViewerType\",\"anonymous\":true,\"fields\":{}},\"X\":{\"nature\":\"native_message\",\"name\":\"X\",\"anonymous\":false,\"fields\":{\"a\":{\"type\":{\"nature\":\"native_value\",\"type\":\"int\"},\"privacy\":\"public\"}}},\"Y\":{\"nature\":\"native_message\",\"name\":\"Y\",\"anonymous\":false,\"fields\":{\"a\":{\"type\":{\"nature\":\"native_value\",\"type\":\"int\"},\"privacy\":\"public\"},\"b\":{\"type\":{\"nature\":\"native_value\",\"type\":\"int\"},\"privacy\":\"public\"}}},\"Z\":{\"nature\":\"reactive_record\",\"name\":\"Z\",\"fields\":{}},\"AutoMaxRecord2\":{\"nature\":\"native_message\",\"name\":\"AutoMaxRecord2\",\"anonymous\":true,\"fields\":{}}},\"channels\":{},\"constructors\":[],\"labels\":[\"setup\"]}");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__state\":\"\",\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__messages\":null,\"__seq\":1} need:false in:0");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":2,\"__entropy\":\"4804307197456638271\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\nCPU:9");
    gold.append("\nMEMORY:728");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"50\"}-->{\"__messages\":null,\"__seq\":3,\"__entropy\":\"-1034601897293430941\",\"__time\":\"50\"} need:false in:-50");
    gold.append("\nNO_ONE: CREATED PRIVATE VIEW");
    gold.append("\n+ NO_ONE DELTA:{\"seq\":3}");
    gold.append("\nNO_ONE|FAILURE:184333");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"75\"}-->{\"__messages\":null,\"__seq\":4,\"__entropy\":\"7848011421992302230\",\"__time\":\"75\"} need:false in:-75");
    gold.append("\nRANDO: CREATED PRIVATE VIEW");
    gold.append("\n+ NO_ONE DELTA:{\"seq\":4}");
    gold.append("\n+ RANDO DELTA:{\"seq\":4}");
    gold.append("\nRANDO|FAILURE:184333");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"100\"}-->{\"__messages\":null,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__time\":\"100\"} need:false in:-100");
    gold.append("\nRANDO|SUCCESS:5");
    gold.append("\n+ NO_ONE DELTA:{\"seq\":5}");
    gold.append("\n+ RANDO DELTA:{\"seq\":5}");
    gold.append("\nMEMORY:846");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"tbl\":{},\"cake\":{\"a\":0,\"b\":0,\"c\":0,\"id\":0},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__last_expire_time\":\"0\",\"__blocked\":false,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"100\",\"__auto_table_row_id\":0}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"tbl\":{},\"cake\":{\"a\":0,\"b\":0,\"c\":0,\"id\":0},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__last_expire_time\":\"0\",\"__blocked\":false,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"100\",\"__auto_table_row_id\":0}");
    gold.append("\n{\"tbl\":{},\"cake\":{\"a\":0,\"b\":0,\"c\":0,\"id\":0},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__last_expire_time\":\"0\",\"__blocked\":false,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"100\",\"__auto_table_row_id\":0}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_RecordToMessage_6 = null;
  private String get_RecordToMessage_6() {
    if (cached_RecordToMessage_6 != null) {
      return cached_RecordToMessage_6;
    }
    cached_RecordToMessage_6 = generateTestOutput(true, "RecordToMessage_6", "./test_code/Conversion_RecordToMessage_success.a");
    return cached_RecordToMessage_6;
  }

  @Test
  public void testRecordToMessageEmission() {
    assertEmissionGood(get_RecordToMessage_6());
  }

  @Test
  public void testRecordToMessageSuccess() {
    assertLivePass(get_RecordToMessage_6());
  }

  @Test
  public void testRecordToMessageGoodWillHappy() {
    assertGoodWillHappy(get_RecordToMessage_6());
  }

  @Test
  public void testRecordToMessageExceptionFree() {
    assertExceptionFree(get_RecordToMessage_6());
  }

  @Test
  public void testRecordToMessageTODOFree() {
    assertTODOFree(get_RecordToMessage_6());
  }

  @Test
  public void stable_RecordToMessage_6() {
    String live = get_RecordToMessage_6();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Conversion_RecordToMessage_success.a");
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
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport org.adamalang.runtime.sys.*;");
    gold.append("\nimport org.adamalang.runtime.sys.web.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.HashMap;");
    gold.append("\nimport java.util.HashSet;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.util.Set;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class RecordToMessage_6 extends LivingDocument {");
    gold.append("\n  private final RTxR x;");
    gold.append("\n  private final RxTable<RTxR> t;");
    gold.append("\n  @Override");
    gold.append("\n  public long __memory() {");
    gold.append("\n    long __sum = super.__memory();");
    gold.append("\n    __sum += x.__memory();");
    gold.append("\n    __sum += t.__memory();");
    gold.append("\n    return __sum;");
    gold.append("\n  }");
    gold.append("\n  public RecordToMessage_6(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RTxR(this);");
    gold.append("\n    t = new RxTable<>(__self, this, \"t\", (RxParent __parent) -> new RTxR(__parent), 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"t\":");
    gold.append("\n            t.__insert(__reader);");
    gold.append("\n            break;");
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
    gold.append("\n          case \"__dedupe\":");
    gold.append("\n            __hydrateDeduper(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
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
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__patch(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"t\":");
    gold.append("\n            t.__patch(__reader);");
    gold.append("\n            break;");
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
    gold.append("\n          case \"__dedupe\":");
    gold.append("\n            __hydrateDeduper(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
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
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"t\");");
    gold.append("\n    t.__dump(__writer);");
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
    gold.append("\n    __dumpDeduper(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
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
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    t.__commit(\"t\", __forward, __reverse);");
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
    gold.append("\n    x.__revert();");
    gold.append("\n    t.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRecordToMessage_6 implements DeltaNode {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRecordToMessage_6() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(RecordToMessage_6 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
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
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Perspective ___perspective, AssetIdEncoder __encoder) {");
    gold.append("\n    RecordToMessage_6 __self = this;");
    gold.append("\n    DeltaRecordToMessage_6 __state = new DeltaRecordToMessage_6();");
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
    gold.append("\n  private static class RTx__ViewerType implements NtMessageBase {");
    gold.append("\n    private RTx__ViewerType(JsonStreamReader __reader) {");
    gold.append("\n      __ingest(__reader);");
    gold.append("\n    }");
    gold.append("\n    public int __DATA_GENERATION = 1;");
    gold.append("\n    private void __ingest(JsonStreamReader __reader) {");
    gold.append("\n      __reader.skipValue();");
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
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static String[] __INDEX_COLUMNS_R = new String[] {\"x\", \"y\"};");
    gold.append("\n  private class RTxR extends RxRecordBase<RTxR> {");
    gold.append("\n    private final RxInt32 x;");
    gold.append("\n    private final RxInt32 y;");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxR(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      x = new RxInt32(this, 0);");
    gold.append("\n      y = new RxInt32(this, 0);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = super.__memory();");
    gold.append("\n      __sum += x.__memory();");
    gold.append("\n      __sum += y.__memory();");
    gold.append("\n      __sum += id.__memory();");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS_R;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {x.getIndexValue(), y.getIndexValue()};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              x.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"y\":");
    gold.append("\n              y.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __patch(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              x.__patch(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"y\":");
    gold.append("\n              y.__patch(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__patch(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      x.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"y\");");
    gold.append("\n      y.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n        y.__commit(\"y\", __forward, __reverse);");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        x.__revert();");
    gold.append("\n        y.__revert();");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"R\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxR implements DeltaNode {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxR() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxR __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTxM implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private RTxM(JsonStreamReader __reader) {");
    gold.append("\n      __ingest(__reader);");
    gold.append("\n    }");
    gold.append("\n    private void __ingest(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxM() {}");
    gold.append("\n    private RTxM(int x) {");
    gold.append("\n      this.x = x;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxM implements DeltaNode {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxM() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      __sum += __dx.__memory();");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxM __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTxM2 implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private int y = 0;");
    gold.append("\n    private RTxM2(JsonStreamReader __reader) {");
    gold.append("\n      __ingest(__reader);");
    gold.append("\n    }");
    gold.append("\n    private void __ingest(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            case \"y\":");
    gold.append("\n              this.y = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"y\");");
    gold.append("\n      __writer.writeInteger(y);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxM2() {}");
    gold.append("\n    private RTxM2(int x, int y) {");
    gold.append("\n      this.x = x;");
    gold.append("\n      this.y = y;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxM2 implements DeltaNode {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private DInt32 __dy;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxM2() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __dy = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public long __memory() {");
    gold.append("\n      long __sum = 40;");
    gold.append("\n      __sum += __dx.__memory();");
    gold.append("\n      __sum += __dy.__memory();");
    gold.append("\n      return __sum;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxM2 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      __dy.show(__item.y, __obj.planField(\"y\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected boolean __is_direct_channel(String channel) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __handle_direct(NtClient who, String channel, Object __message) throws AbortMessageException {");
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
    gold.append("\n  public WebResponse __get(NtClient __who, WebGet __request) {");
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
    gold.append("\n  public boolean __onCanAssetAttached(NtClient __cvalue) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onAssetAttached(NtClient __cvalue, NtAsset __pvalue) {");
    gold.append("\n");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    return false;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {");
    gold.append("\n");
    gold.append("\n  }");
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
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 6;");
    gold.append("\n    __track(0);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxR> _AutoRef1 = t;");
    gold.append("\n      RTxM _AutoExpr3 = new RTxM(1);");
    gold.append("\n      RTxR _CreateRef2 = _AutoRef1.make();");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      _CreateRef2.x.set(_AutoExpr3.x);");
    gold.append("\n    }");
    gold.append("\n    __track(1);");
    gold.append("\n    final RTxM m = Utility.convertSingle(x, (__obj) -> new RTxM(__obj.x.get()));");
    gold.append("\n    __track(2);");
    gold.append("\n    RTxM[] arr = Utility.convertMultiple(t.iterate(true), (__n) -> new RTxM[__n], (__obj) -> new RTxM(__obj.x.get()));");
    gold.append("\n    __track(3);");
    gold.append("\n    NtMaybe<RTxM> mm = new NtMaybe<RTxM>(Utility.convertMaybe(new NtMaybe<RTxR>(x), (__obj) -> new RTxM(__obj.x.get())));");
    gold.append("\n    __track(4);");
    gold.append("\n    final RTxM2 m2 = Utility.convertSingle(x, (__obj) -> new RTxM2(__obj.x.get(), __obj.y.get()));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\nBegin");
    gold.append("\nEnd");
    gold.append("\n--REFLECTION RESULTS-------------------------------------");
    gold.append("\n{\"types\":{\"#root\":{\"nature\":\"reactive_record\",\"name\":\"Root\",\"fields\":{}},\"__ViewerType\":{\"nature\":\"native_message\",\"name\":\"__ViewerType\",\"anonymous\":true,\"fields\":{}},\"R\":{\"nature\":\"reactive_record\",\"name\":\"R\",\"fields\":{}},\"M\":{\"nature\":\"native_message\",\"name\":\"M\",\"anonymous\":false,\"fields\":{\"x\":{\"type\":{\"nature\":\"native_value\",\"type\":\"int\"},\"privacy\":\"public\"}}},\"M2\":{\"nature\":\"native_message\",\"name\":\"M2\",\"anonymous\":false,\"fields\":{\"x\":{\"type\":{\"nature\":\"native_value\",\"type\":\"int\"},\"privacy\":\"public\"},\"y\":{\"type\":{\"nature\":\"native_value\",\"type\":\"int\"},\"privacy\":\"public\"}}}},\"channels\":{},\"constructors\":[],\"labels\":[]}");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__auto_table_row_id\":1,\"t\":{\"1\":{\"x\":1,\"y\":0,\"id\":1}},\"__messages\":null,\"__seq\":1} need:false in:0");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":2,\"__entropy\":\"4804307197456638271\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\nCPU:7");
    gold.append("\nMEMORY:882");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"50\"}-->{\"__messages\":null,\"__seq\":3,\"__entropy\":\"-1034601897293430941\",\"__time\":\"50\"} need:false in:-50");
    gold.append("\nNO_ONE: CREATED PRIVATE VIEW");
    gold.append("\n+ NO_ONE DELTA:{\"seq\":3}");
    gold.append("\nNO_ONE|FAILURE:184333");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"75\"}-->{\"__messages\":null,\"__seq\":4,\"__entropy\":\"7848011421992302230\",\"__time\":\"75\"} need:false in:-75");
    gold.append("\nRANDO: CREATED PRIVATE VIEW");
    gold.append("\n+ NO_ONE DELTA:{\"seq\":4}");
    gold.append("\n+ RANDO DELTA:{\"seq\":4}");
    gold.append("\nRANDO|FAILURE:184333");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"100\"}-->{\"__messages\":null,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__time\":\"100\"} need:false in:-100");
    gold.append("\nRANDO|SUCCESS:5");
    gold.append("\n+ NO_ONE DELTA:{\"seq\":5}");
    gold.append("\n+ RANDO DELTA:{\"seq\":5}");
    gold.append("\nMEMORY:1000");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"x\":{\"x\":0,\"y\":0,\"id\":0},\"t\":{\"1\":{\"x\":1,\"y\":0,\"id\":1}},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__last_expire_time\":\"0\",\"__blocked\":false,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"100\",\"__auto_table_row_id\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":{\"x\":0,\"y\":0,\"id\":0},\"t\":{\"1\":{\"x\":1,\"y\":0,\"id\":1}},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__last_expire_time\":\"0\",\"__blocked\":false,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"100\",\"__auto_table_row_id\":1}");
    gold.append("\n{\"x\":{\"x\":0,\"y\":0,\"id\":0},\"t\":{\"1\":{\"x\":1,\"y\":0,\"id\":1}},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__last_expire_time\":\"0\",\"__blocked\":false,\"__seq\":5,\"__entropy\":\"-8929183248358367000\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"100\",\"__auto_table_row_id\":1}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_WhenCantConvertBasedOnFields_7 = null;
  private String get_WhenCantConvertBasedOnFields_7() {
    if (cached_WhenCantConvertBasedOnFields_7 != null) {
      return cached_WhenCantConvertBasedOnFields_7;
    }
    cached_WhenCantConvertBasedOnFields_7 = generateTestOutput(false, "WhenCantConvertBasedOnFields_7", "./test_code/Conversion_WhenCantConvertBasedOnFields_failure.a");
    return cached_WhenCantConvertBasedOnFields_7;
  }

  @Test
  public void testWhenCantConvertBasedOnFieldsFailure() {
    assertLiveFail(get_WhenCantConvertBasedOnFields_7());
  }

  @Test
  public void testWhenCantConvertBasedOnFieldsNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_WhenCantConvertBasedOnFields_7());
  }

  @Test
  public void testWhenCantConvertBasedOnFieldsExceptionFree() {
    assertExceptionFree(get_WhenCantConvertBasedOnFields_7());
  }

  @Test
  public void testWhenCantConvertBasedOnFieldsTODOFree() {
    assertTODOFree(get_WhenCantConvertBasedOnFields_7());
  }

  @Test
  public void stable_WhenCantConvertBasedOnFields_7() {
    String live = get_WhenCantConvertBasedOnFields_7();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Conversion_WhenCantConvertBasedOnFields_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[{\"range\":{\"start\":{\"line\":11,\"character\":2},\"end\":{\"line\":11,\"character\":8}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type 'string' is unable to store type 'int'. (TypeCheckReferences)\"},{\"range\":{\"start\":{\"line\":15,\"character\":2},\"end\":{\"line\":15,\"character\":5}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type 'int' is unable to store type 'string'. (TypeCheckReferences)\"},{\"range\":{\"start\":{\"line\":6,\"character\":2},\"end\":{\"line\":6,\"character\":8}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type 'string' is unable to store type 'int'. (TypeCheckReferences)\"},{\"range\":{\"start\":{\"line\":21,\"character\":2},\"end\":{\"line\":21,\"character\":11}},\"severity\":1,\"source\":\"error\",\"message\":\"The type 'BigS' contains field 'z' which is not found within 'SmallI'. (RuleSetStructures)\"},{\"range\":{\"start\":{\"line\":21,\"character\":2},\"end\":{\"line\":21,\"character\":11}},\"severity\":1,\"source\":\"error\",\"message\":\"The type 'BigI' contains field 'z' which is not found within 'SmallI'. (RuleSetStructures)\"},{\"range\":{\"start\":{\"line\":22,\"character\":2},\"end\":{\"line\":22,\"character\":11}},\"severity\":1,\"source\":\"error\",\"message\":\"The type 'BigS' contains field 'z' which is not found within 'SmallS'. (RuleSetStructures)\"},{\"range\":{\"start\":{\"line\":1,\"character\":2},\"end\":{\"line\":1,\"character\":5}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type 'int' is unable to store type 'string'. (TypeCheckReferences)\"},{\"range\":{\"start\":{\"line\":22,\"character\":2},\"end\":{\"line\":22,\"character\":11}},\"severity\":1,\"source\":\"error\",\"message\":\"The type 'BigI' contains field 'z' which is not found within 'SmallS'. (RuleSetStructures)\"},{\"range\":{\"start\":{\"line\":1,\"character\":2},\"end\":{\"line\":1,\"character\":5}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type 'int' is unable to store type 'string'. (TypeCheckReferences)\"},{\"range\":{\"start\":{\"line\":6,\"character\":2},\"end\":{\"line\":6,\"character\":8}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type 'string' is unable to store type 'int'. (TypeCheckReferences)\"},{\"range\":{\"start\":{\"line\":11,\"character\":2},\"end\":{\"line\":11,\"character\":8}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type 'string' is unable to store type 'int'. (TypeCheckReferences)\"},{\"range\":{\"start\":{\"line\":15,\"character\":2},\"end\":{\"line\":15,\"character\":5}},\"severity\":1,\"source\":\"error\",\"message\":\"Type check failure: the type 'int' is unable to store type 'string'. (TypeCheckReferences)\"}]\"--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
}
