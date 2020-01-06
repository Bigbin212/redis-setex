package com.redis.demo.service;

import org.springframework.stereotype.Service;

/**
 *
 * redis 订阅发布  消息接收器/处理器
 */
@Service
public class RedisReceiver {

    public void receiveMessage(String message) {
        System.out.println("消息处理器 处理用户信息："+message);
        //这里是收到通道的消息之后执行的方法
        //此处执行接收到消息后的 业务逻辑
    }
}
