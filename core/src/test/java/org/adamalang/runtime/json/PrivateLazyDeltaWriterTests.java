/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.runtime.json;

import org.adamalang.runtime.natives.NtClient;
import org.junit.Assert;
import org.junit.Test;

public class PrivateLazyDeltaWriterTests {

    @Test
    public void bunchAdoAboutNothing() {
        JsonStreamWriter writer = new JsonStreamWriter();
        PrivateLazyDeltaWriter lazy = PrivateLazyDeltaWriter.bind(NtClient.NO_ONE, writer);
        lazy.planObject().planField("x").planArray();
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void manifestAbove() {
        JsonStreamWriter writer = new JsonStreamWriter();
        PrivateLazyDeltaWriter lazy = PrivateLazyDeltaWriter.bind(NtClient.NO_ONE, writer);
        lazy.planObject().planField("x").planArray().manifest();
        Assert.assertEquals("{\"x\":[", writer.toString());
    }

    @Test
    public void manifestX() {
        JsonStreamWriter writer = new JsonStreamWriter();
        PrivateLazyDeltaWriter lazy = PrivateLazyDeltaWriter.bind(NtClient.NO_ONE, writer);
        lazy.planObject().planField("x").planArray().writeFastString("x");
        Assert.assertEquals("{\"x\":[\"x\"", writer.toString());
    }

    @Test
    public void simpleObject() {
        JsonStreamWriter writer = new JsonStreamWriter();
        PrivateLazyDeltaWriter lazy = PrivateLazyDeltaWriter.bind(NtClient.NO_ONE, writer);
        PrivateLazyDeltaWriter obj = lazy.planObject();
        obj.planField("x").writeInt(123);
        obj.planField("y").writeNull();;
        obj.planField(42).writeString("hi");
        obj.planField(13).writeDouble(13.271);
        obj.planField("z").writeBool(true);
        obj.end();
        Assert.assertEquals("{\"x\":123,\"y\":null,\"42\":\"hi\",\"13\":13.271,\"z\":true}", writer.toString());
    }

    @Test
    public void simpleArray() {
        JsonStreamWriter writer = new JsonStreamWriter();
        PrivateLazyDeltaWriter lazy = PrivateLazyDeltaWriter.bind(NtClient.NO_ONE, writer);
        PrivateLazyDeltaWriter obj = lazy.planArray();
        obj.writeInt(123);
        obj.writeNull();;
        obj.writeString("hi");
        obj.writeDouble(13.271);
        obj.writeBool(true);
        obj.end();
        Assert.assertEquals("[123,null,\"hi\",13.271,true]", writer.toString());
    }
}
