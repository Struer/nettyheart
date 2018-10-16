package com.heart;

import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.timeout.IdleStateAwareChannelHandler;
import org.jboss.netty.handler.timeout.IdleStateEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 优化后使用HelloHandler，该类保留作参考
 */
public class HiHandler extends IdleStateAwareChannelHandler implements ChannelHandler {

    // IdleStateAwareChannelHandler中channelIdle方法
	@Override
	public void channelIdle(ChannelHandlerContext ctx, IdleStateEvent e) throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("ss");
        System.out.println(e.getState() + format.format(new Date()));

        super.channelIdle(ctx, e);
	}
}
