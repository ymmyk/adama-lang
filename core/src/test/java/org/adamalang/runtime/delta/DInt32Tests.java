/*
 * This file is subject to the terms and conditions outlined in the file 'LICENSE' (hint: it's MIT); this file is located in the root directory near the README.md which you should also read.
 *
 * This file is part of the 'Adama' project which is a programming language and document store for board games; however, it can be so much more.
 *
 * See https://www.adama-platform.com/ for more information.
 *
 * (c) 2020 - 2022 by Jeffrey M. Barber ( http://jeffrey.io )
 */
package org.adamalang.runtime.delta;

import org.adamalang.runtime.delta.secure.TestKey;
import org.adamalang.runtime.json.JsonStreamWriter;
import org.adamalang.runtime.json.PrivateLazyDeltaWriter;
import org.adamalang.runtime.natives.NtPrincipal;
import org.junit.Assert;
import org.junit.Test;

public class DInt32Tests {
  @Test
  public void flow() {
    final var db = new DInt32();
    final var stream = new JsonStreamWriter();
    final var writer = PrivateLazyDeltaWriter.bind(NtPrincipal.NO_ONE, stream, null, TestKey.ENCODER);
    db.show(1, writer);
    db.show(1, writer);
    db.show(22, writer);
    db.show(22, writer);
    db.show(3, writer);
    db.show(3, writer);
    db.hide(writer);
    db.hide(writer);
    db.show(4, writer);
    db.show(4, writer);
    db.show(5, writer);
    db.show(5, writer);
    Assert.assertEquals("1223null45", stream.toString());
    Assert.assertEquals(40, db.__memory());
    db.clear();
  }
}
