package com.atguigu.service.impl;

import com.atguigu.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "2081 Hello" + name;
    }
}
