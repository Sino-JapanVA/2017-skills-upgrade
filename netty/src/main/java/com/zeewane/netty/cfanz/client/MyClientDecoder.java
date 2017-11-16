package com.zeewane.netty.cfanz.client;

import java.nio.ByteBuffer;
import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class MyClientDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf buffer,
                          List<Object> out) throws Exception {
        //UnpooledUnsafeDirectByteBuf(ridx: 0, widx: 1, cap: 1024)
        if (buffer != null) {
            ByteBuffer msg = null;
            try {
                if (buffer.readableBytes() > 0) {
                    msg = ByteBuffer.allocate(buffer.readableBytes());
                    byte[] bb = new byte[buffer.readableBytes()];
                    buffer.readBytes(bb);
                    msg.put(bb);
                    msg.flip();
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = null;
            }
            if (msg != null) {
                out.add(msg);
            }
        }
    }

}
