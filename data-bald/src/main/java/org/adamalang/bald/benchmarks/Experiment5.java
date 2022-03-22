package org.adamalang.bald.benchmarks;

import org.adamalang.common.NamedRunnable;
import org.adamalang.common.SimpleExecutor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Experiment5 {

  public static void main(String[] args) throws Exception {
    SimpleExecutor executor = SimpleExecutor.create("executor");
    CountDownLatch first = new CountDownLatch(1);
    Thread.sleep(1000);
    executor.execute(new NamedRunnable("dump-slf4j") {
      @Override
      public void execute() throws Exception {
        first.countDown();
      }
    });
    first.await(1000, TimeUnit.MILLISECONDS);
    System.out.println("asked-wait-ms,achieved-wait-ms");
    for (int latency = 0; latency < 40; latency++) {
      final int latencyEx = latency;
      final long started = System.currentTimeMillis();
      CountDownLatch latch = new CountDownLatch(1);
      executor.schedule(new NamedRunnable("precision") {
        @Override
        public void execute() throws Exception {
          System.out.println(latencyEx + "," + (System.currentTimeMillis() - started));
          latch.countDown();
        }
      }, latency);
      latch.await(10000, TimeUnit.MILLISECONDS);
    }
  }
}
