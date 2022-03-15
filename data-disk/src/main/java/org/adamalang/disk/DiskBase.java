/*
 * This file is subject to the terms and conditions outlined in the file 'LICENSE' (hint: it's MIT); this file is located in the root directory near the README.md which you should also read.
 *
 * This file is part of the 'Adama' project which is a programming language and document store for board games; however, it can be so much more.
 *
 * See http://www.adama-lang.org/ for more information.
 *
 * (c) 2020 - 2022 by Jeffrey M. Barber (http://jeffrey.io)
 */
package org.adamalang.disk;

import org.adamalang.common.NamedRunnable;
import org.adamalang.common.SimpleExecutor;
import org.adamalang.runtime.data.Key;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class DiskBase {
  public final SimpleExecutor executor;
  public final HashMap<Key, DocumentMemoryLog> memory;
  public final File dataDirectory;
  public final File walWorkingDirectory;
  public final int walCutOffBytes;
  public final int nanosecondsToFlush;
  public final DiskDataMetrics metrics;

  public DiskBase(DiskDataMetrics metrics, SimpleExecutor executor, File root) throws Exception {
    this.executor = executor;
    this.metrics = metrics;
    this.memory = new HashMap<>();
    this.walWorkingDirectory = new File(root, "wal");
    this.dataDirectory = new File(root, "data");
    this.walCutOffBytes = 16 * 1024 * 1024;
    this.nanosecondsToFlush = 1000000;
    if (!(walWorkingDirectory.exists() && walWorkingDirectory.isDirectory()) && !walWorkingDirectory.mkdirs()) {
      throw new RuntimeException("Failed to detect/find/create wal working directory:" + walWorkingDirectory.getAbsolutePath());
    }
    if (!(dataDirectory.exists() && dataDirectory.isDirectory()) && !dataDirectory.mkdirs()) {
      throw new RuntimeException("Failed to detect/find/create root directory:" + dataDirectory.getAbsolutePath());
    }
  }

  public DocumentMemoryLog getOrCreate(Key key) {
    DocumentMemoryLog log = memory.get(key);
    if (log == null) {
      File spacePath = new File(dataDirectory, key.space);
      if (!spacePath.exists()) {
        spacePath.mkdirs();
      }
      log = new DocumentMemoryLog(key, spacePath);
      memory.put(key, log);
    }
    return log;
  }

  public void flush(File fileToDelete, Runnable after) {
    LinkedList<DocumentMemoryLog> logs = new LinkedList<>(memory.values());
    executor.scheduleNano(new NamedRunnable("flushing-document") {
      @Override
      public void execute() throws Exception {
        try {
          DocumentMemoryLog log = logs.removeFirst();
          log.flush();
          if (!log.isActive() && log.refZero()) {
            memory.remove(log.key);
          }
          executor.schedule(this, 25000);
        } catch (NoSuchElementException nss) {
          fileToDelete.delete();
          after.run();
        }
      }
    }, 5000);
  }

  public void flushAllNow() throws IOException {
    for (DocumentMemoryLog log : memory.values()) {
      log.flush();
    }
    memory.clear();
  }

  public void shutdown() {
    executor.shutdown();
  }
}
