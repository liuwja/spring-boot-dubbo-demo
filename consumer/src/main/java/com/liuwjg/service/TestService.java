package com.liuwjg.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @DubboReference
    private UserService userService;

    public void sayHello(String name){
        String s = userService.sayHello(name);
        System.out.println(s);
    }
}
