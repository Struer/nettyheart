netty入门教程话题之心跳

1、学习idleStateHandler

用来检测会话状态

2、心跳其实就是一个普通的请求，特点数据简单，业务也简单


心跳对于服务端来说，定时清除闲置会话inactive(netty5) channelclose(netty3)


心跳对客户端来说，用来检测会话是否断开，是否重连！ 用来检测网络延时！