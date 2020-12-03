package com.liuwjg;

import com.liuwjg.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConsumerApplicationTests {

    @Autowired
    private TestService testService;
    @Test
    void contextLoads() {

    }
    @Test
    void test() throws InterruptedException {
        testService.sayHello("liuwjg");
        Thread.sleep(10000);
    }
}
