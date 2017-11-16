package com.zeewane.netty.cfanz;

import java.nio.ByteBuffer;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * 编码器
 * @author zeewane
 */
public class MyEncoder extends MessageToByteEncoder<ByteBuffer> {

    @Override
    protected void encode(ChannelHandlerContext ctx, ByteBuffer message,
                          ByteBuf out) throws Exception {

        if (message == null) {
            return;
        }
        if (message.hasArray()) {
            byte[] msg = message.array();
            if (msg == null || msg.length <= 0) {
                return;
            }
            out.writeBytes(msg);
        }
    }
}
