package com.heart;

import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.timeout.IdleStateAwareChannelHandler;
import org.jboss.netty.handler.timeout.IdleStateEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HiHandler extends IdleStateAwareChannelHandler implements ChannelHandler {

	@Override
	public void channelIdle(ChannelHandlerContext ctx, IdleStateEvent e) throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("ss");
        System.out.println(e.getState() + format.format(new Date()));

        super.channelIdle(ctx, e);
	}
}
