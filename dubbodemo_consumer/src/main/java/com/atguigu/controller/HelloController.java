package com.atguigu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(check = false,loadbalance = "roundrobin")
    private HelloService helloService;

    @RequestMapping("/getName")
    public String getName(String name){
        String str = helloService.sayHello(name);
        return str;
    }
}
