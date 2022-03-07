package org.adamalang.net.client.sm;

import org.adamalang.common.Callback;
import org.adamalang.common.ErrorCodeException;
import org.adamalang.net.TestBed;
import org.adamalang.runtime.data.Key;
import org.adamalang.runtime.natives.NtClient;
import org.junit.Assert;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ComplexHelper {

  public static final String SIMPLE = "@static { create(who) { return true; } } @connected(who) { return true; } public int x; @construct { x = 123; } message Y { int z; } channel foo(Y y) { x += y.z; } @can_attach(who) { return true; } @attached(who, what) {} ";
  public static final String VIEW_MIRROR = "@static { create(who) { return true; } } @connected(who) { return true; } view int z; bubble<who, v> zz = 1000 + v.z; public int x; @construct { x = 123; } message Y { int z; } channel foo(Y y) { x += y.z; } @can_attach(who) { return true; } @attached(who, what) {} ";
  public static final String BAD_CODE = "@can_attach(who) { int x = 1; while(true) { x++; } return true; } @attached(who, what) { while(true) {} } @static { create(who) { return true; } } @connected(who) { return true; } message M {} channel foo(M y) { while(true) {} }  ";

  public static void spinUpCapacity(TestBed[] servers, boolean start, String code) throws Exception {
    for (int k = 0; k < servers.length; k++) {
      servers[k] = new TestBed(20005 + k, code);
      CountDownLatch latchMade = new CountDownLatch(1);
      servers[k].coreService.create(
          NtClient.NO_ONE,
          new Key("space", "key"),
          "{}",
          null,
          new Callback<Void>() {
            @Override
            public void success(Void value) {
              latchMade.countDown();
            }

            @Override
            public void failure(ErrorCodeException ex) {}
          });
      Assert.assertTrue(latchMade.await(1000, TimeUnit.MILLISECONDS));
      if (start) {
        servers[k].startServer();
      }
    }
  }

  public static void startCapacity(TestBed[] servers) throws Exception{
    for (int k = 0; k < servers.length; k++) {
        servers[k].startServer();
    }
    System.err.println("START WENT GREAT");
  }

  public static void stopCapacity(TestBed[] servers) {
    try {
      for (int k = 0; k < servers.length; k++) {
        if (servers[k] != null) {
          servers[k].close();
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      System.err.println("SHUTDOWN WENT POORLY");
    }
  }
}
