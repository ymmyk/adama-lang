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
package org.adamalang.caravan.events;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class LocalCacheTests {

  private ArrayList<byte[]> prepare() {
    ArrayList<byte[]> writes = new ArrayList<>();

    {
      Events.Snapshot snap = new Events.Snapshot();
      snap.seq = 1;
      snap.document = "{\"x\":1}";
      snap.history = 10;
      ByteBuf buf = Unpooled.buffer();
      EventCodec.write(buf, snap);
      writes.add(ByteArrayHelper.convert(buf));
    }
    {
      Events.Batch batch = new Events.Batch();
      batch.changes = new Events.Change[1];
      batch.changes[0] = new Events.Change();
      batch.changes[0].seq_begin = 2;
      batch.changes[0].seq_end = 4;
      batch.changes[0].active = false;
      batch.changes[0].agent = "agent";
      batch.changes[0].authority = "authority";
      batch.changes[0].dAssetBytes = 100;
      batch.changes[0].redo = "{\"x\":2}";
      batch.changes[0].undo = "undo";
      ByteBuf buf = Unpooled.buffer();
      EventCodec.write(buf, batch);
      writes.add(ByteArrayHelper.convert(buf));
    }
    {
      Events.Change change = new Events.Change();
      change.seq_begin = 5;
      change.seq_end = 5;
      change.active = false;
      change.agent = "agent";
      change.authority = "authority";
      change.dAssetBytes = 100;
      change.redo = "{\"x\":3}";
      change.undo = "undo";
      ByteBuf buf = Unpooled.buffer();
      EventCodec.write(buf, change);
      writes.add(ByteArrayHelper.convert(buf));
    }
    return writes;
  }

  @Test
  public void flow() {
    AtomicInteger finishedCount = new AtomicInteger(0);
    LocalCache cache = new LocalCache() {
      @Override
      public void finished() throws Exception {
        finishedCount.incrementAndGet();
      }
    };
    Assert.assertEquals(0, cache.seq());
    Assert.assertEquals(3, cache.filter(prepare()).size());
    Assert.assertEquals(3, cache.filter(prepare()).size());
    for (byte[] write : prepare()) {
      EventCodec.route(Unpooled.wrappedBuffer(write), cache);
    }
    Assert.assertEquals(0, cache.filter(prepare()).size());
  }
}
