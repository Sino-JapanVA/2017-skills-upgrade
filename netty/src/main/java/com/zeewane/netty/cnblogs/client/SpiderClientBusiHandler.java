package com.zeewane.netty.cnblogs.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SpiderClientBusiHandler extends SimpleChannelInboundHandler<Object> {

    static final Logger logger = LoggerFactory.getLogger(SpiderClientBusiHandler.class);

    //        @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object origMsg) {
        System.out.println(origMsg.toString());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
    }

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, Object msg) throws Exception {
        // TODO Auto-generated method stub

    }
}
