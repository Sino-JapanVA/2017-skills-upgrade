package com.zeewane.netty.ssl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.ssl.SslHandler;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.Promise;

/**
 * 只有这边可以尝试来替换国密的东西，并且将这个handler注入到pipeline的第一个去
 * 
 * 
 * 不难发现，我们需要一个SSLEngine对象来构建SslHandler。根据资料可以知道，需要根据已初始化的 SSLContext 来调用 SSLContext.createSSLEngine() 即可创建 SSLEngine。
 * 所以基于Netty框架的在TCP连接中使用SSL/TLS加密的流程如下：

        在代码中导入证书，并使用该证书构造SSLContext
        调用SSLContext对象的createSSLEngine()创建 SSLEngine
        用SSLEngine对象去初始化Netty的SslHandler
        在Netty的ChannelInitializer.initChannel()中，往管道(pipeline)中安装SslHandler。
 * @author zeewane
 */
public class GmSslHandler extends SslHandler {

    public GmSslHandler(SSLEngine engine) {
        super(engine);

        // 这个引擎是不可能去改的，还是ssl的engine

    }

    public GmSslHandler(SSLEngine engine, boolean startTls) {
        super(engine, startTls);
        
        
    }

    @Override
    public long getHandshakeTimeoutMillis() {
        // TODO Auto-generated method stub
        return super.getHandshakeTimeoutMillis();
    }

    @Override
    public void setHandshakeTimeout(long handshakeTimeout, TimeUnit unit) {
        // TODO Auto-generated method stub
        super.setHandshakeTimeout(handshakeTimeout, unit);
    }

    @Override
    public void setHandshakeTimeoutMillis(long handshakeTimeoutMillis) {
        // TODO Auto-generated method stub
        super.setHandshakeTimeoutMillis(handshakeTimeoutMillis);
    }

    @Override
    public long getCloseNotifyTimeoutMillis() {
        // TODO Auto-generated method stub
        return super.getCloseNotifyTimeoutMillis();
    }

    @Override
    public void setCloseNotifyTimeout(long closeNotifyTimeout, TimeUnit unit) {
        // TODO Auto-generated method stub
        super.setCloseNotifyTimeout(closeNotifyTimeout, unit);
    }

    @Override
    public void setCloseNotifyTimeoutMillis(long closeNotifyTimeoutMillis) {
        // TODO Auto-generated method stub
        super.setCloseNotifyTimeoutMillis(closeNotifyTimeoutMillis);
    }

    @Override
    public SSLEngine engine() {
        // TODO Auto-generated method stub
        return super.engine();
    }

    @Override
    public Future<Channel> handshakeFuture() {
        // TODO Auto-generated method stub
        return super.handshakeFuture();
    }

    @Override
    public ChannelFuture close() {
        // TODO Auto-generated method stub
        return super.close();
    }

    @Override
    public ChannelFuture close(ChannelPromise future) {
        // TODO Auto-generated method stub
        return super.close(future);
    }

    @Override
    public Future<Channel> sslCloseFuture() {
        // TODO Auto-generated method stub
        return super.sslCloseFuture();
    }

    @Override
    public void handlerRemoved0(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.handlerRemoved0(ctx);
    }

    @Override
    public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
        // TODO Auto-generated method stub
        super.disconnect(ctx, promise);
    }

    @Override
    public void close(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
        // TODO Auto-generated method stub
        super.close(ctx, promise);
    }

    @Override
    public void read(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.read(ctx);
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg,
                      ChannelPromise promise) throws Exception {
        // TODO Auto-generated method stub
        super.write(ctx, msg, promise);
    }

    @Override
    public void flush(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.flush(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.channelInactive(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // TODO Auto-generated method stub
        super.exceptionCaught(ctx, cause);
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in,
                          List<Object> out) throws SSLException {
        // TODO Auto-generated method stub
        super.decode(ctx, in, out);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.channelReadComplete(ctx);
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.handlerAdded(ctx);
    }

    @Override
    public Future<Channel> renegotiate() {
        // TODO Auto-generated method stub
        return super.renegotiate();
    }

    @Override
    public Future<Channel> renegotiate(Promise<Channel> promise) {
        // TODO Auto-generated method stub
        return super.renegotiate(promise);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.channelActive(ctx);
    }

}
