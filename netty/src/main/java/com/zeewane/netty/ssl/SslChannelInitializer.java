package com.zeewane.netty.ssl;

import javax.net.ssl.SSLEngine;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslHandler;

/**
 * netty的ssl通道尝试
 * 
 * https://waylau.gitbooks.io/essential-netty-in-action/CORE%20FUNCTIONS/Securing%20Netty%20applications%20with%20SSLTLS.html
 * 
 * @author zeewane
 * @time 2017-11-14 10:36:05
 */
public class SslChannelInitializer extends ChannelInitializer<Channel> {

    private final SslContext context;
    private final boolean    startTls;

    public SslChannelInitializer(SslContext context, boolean client, boolean startTls) { //1 使用构造函数来传递 SSLContext 用于使用(startTls 是否启用)
        this.context = context;
        this.startTls = startTls;
    }

    @Override
    protected void initChannel(Channel ch) throws Exception {
        SSLEngine engine = context.newEngine(ch.alloc()); //2 从 SslContext 获得一个新的 SslEngine 。给每个 SslHandler 实例使用一个新的 SslEngine
        engine.setUseClientMode(true); //3 设置 SslEngine 是 client 或者是 server 模式
        ch.pipeline().addFirst("ssl", new SslHandler(engine, startTls)); //4 添加 SslHandler 到 pipeline 作为第一个处理器
        /*
         * 在大多数情况下,SslHandler 将成为 ChannelPipeline 中的第一个 ChannelHandler 。
         * 这将确保所有其他 ChannelHandler 应用他们的逻辑到数据后加密后才发生,从而确保他们的变化是安全的。
         * 这个SslHandler我可不可以做点手脚
         */
        
    }

}
