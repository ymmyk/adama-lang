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
package org.adamalang.runtime.delta;

import org.adamalang.runtime.delta.secure.TestKey;
import org.adamalang.runtime.json.JsonStreamWriter;
import org.adamalang.runtime.json.PrivateLazyDeltaWriter;
import org.adamalang.runtime.natives.NtPrincipal;
import org.adamalang.runtime.natives.NtTime;
import org.junit.Assert;
import org.junit.Test;

public class DTimeTests {
  @Test
  public void flow() {
    final var db = new DTime();
    final var stream = new JsonStreamWriter();
    final var writer = PrivateLazyDeltaWriter.bind(NtPrincipal.NO_ONE, stream, null, TestKey.ENCODER, 0);
    db.show(new NtTime(13, 14), writer);
    db.show(new NtTime(15, 17), writer);
    db.hide(writer);
    db.hide(writer);
    db.show(new NtTime(13, 14), writer);
    db.show(new NtTime(15, 17), writer);
    Assert.assertEquals("\"13:14\"\"15:17\"null\"13:14\"\"15:17\"", stream.toString());
    Assert.assertEquals(56, db.__memory());
    db.clear();
  }
}
