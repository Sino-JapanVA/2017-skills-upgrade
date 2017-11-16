package com.zeewane.netty.ssl;

import javax.net.ssl.SSLEngine;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.ssl.SslContext;

/**
 * 国密的初始化
 * @author zeewane
 */
public class GmSslChannelInitializer extends ChannelInitializer<Channel> {

    /**
     * 使用构造函数来传递 SSLContext 用于使用(startTls 是否启用)
     * 从 SslContext 获得一个新的 SslEngine 。给每个 SslHandler 实例使用一个新的 SslEngine
     * 设置 SslEngine 是 client 或者是 server 模式
     * 添加 SslHandler 到 pipeline 作为第一个处理器
     */

    private final SslContext context;
    private final boolean    startTls;

    public GmSslChannelInitializer(SslContext context, boolean client, boolean startTls) { //1
        this.context = context;
        this.startTls = startTls;
    }

    @Override
    protected void initChannel(Channel ch) throws Exception {
        SSLEngine engine = context.newEngine(ch.alloc()); //2
        engine.setUseClientMode(true); //3
        ch.pipeline().addFirst("ssl", new GmSslHandler(engine, startTls)); //4
    }
}
