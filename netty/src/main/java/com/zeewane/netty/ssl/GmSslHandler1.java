package com.zeewane.netty.ssl;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * 这个是参照书里面的黑ip拦截来做，但是这层已经是后面的了
 * 
 * @author zeewane
 */
public class GmSslHandler1 extends ChannelHandlerAdapter {

    @Override
    protected void ensureNotSharable() {
        // TODO Auto-generated method stub
        super.ensureNotSharable();
    }

    @Override
    public boolean isSharable() {
        // TODO Auto-generated method stub
        return super.isSharable();
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.handlerAdded(ctx);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.handlerRemoved(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // TODO Auto-generated method stub
        super.exceptionCaught(ctx, cause);
    }

}
