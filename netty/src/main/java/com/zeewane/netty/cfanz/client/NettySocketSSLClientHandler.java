package com.zeewane.netty.cfanz.client;

import java.nio.ByteBuffer;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class NettySocketSSLClientHandler extends SimpleChannelInboundHandler<ByteBuffer> {

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, ByteBuffer msg) throws Exception {
        System.out.println("客户端receive msg ");
        byte[] array = new byte[] { 00, 01, 00, 00, 00, 06, 05, 03, (byte) 7d, 00, 00, 07 };
        ByteBuffer bu = ByteBuffer.wrap(array);
        ctx.channel().writeAndFlush(bu);
    }

}
