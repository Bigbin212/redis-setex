package com.redis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class SampleController {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @RequestMapping(value = "/redisPubSub",method = RequestMethod.GET)
    public void redisPubSub(String msg){
        redisTemplate.convertAndSend("test",msg);
        redisTemplate.opsForValue().set("testKey", msg, 20, TimeUnit.SECONDS);
    }

}
