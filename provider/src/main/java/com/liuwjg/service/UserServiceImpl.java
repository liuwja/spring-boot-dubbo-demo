package com.liuwjg.service;


import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
