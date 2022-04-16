package com.jiker.dubbo.demo.consumer;

import com.jiker.dubbo.demo.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerApplication2 {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer2.xml");
        context.start();
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("result: " + userService.getUserByUserName("*").toString());
    }
}
