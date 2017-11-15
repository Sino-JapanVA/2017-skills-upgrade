package com.zeewane.netty.cnblogs.server;

import java.net.InetSocketAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SpiderServerBusiHandler extends SimpleChannelInboundHandler<Object> {

    static final Logger logger = LoggerFactory.getLogger(SpiderServerBusiHandler.class);

    //    @Override // 这个override没有用
    protected void channelRead0(final ChannelHandlerContext ctx,
                                final Object msg) throws Exception {
        System.out.println(msg.toString());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.error("channel " + ((InetSocketAddress) ctx.channel().remoteAddress()).toString()
                     + " exception:",
            cause);
        ctx.close();
    }

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, Object msg) throws Exception {
        // TODO Auto-generated method stub

    }

}
