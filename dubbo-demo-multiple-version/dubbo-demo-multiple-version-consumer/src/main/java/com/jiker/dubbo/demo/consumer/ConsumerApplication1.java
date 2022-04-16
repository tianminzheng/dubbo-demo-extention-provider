package com.jiker.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiker.dubbo.demo.UserService;

public class ConsumerApplication1 {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer1.xml");
        context.start();
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("result: " + userService.getUserByUserName("*").toString());
    }
}
