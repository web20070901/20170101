package com.wangyulong;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringXML {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    /*    Leader leader = context.getBean(Leader.class);
        System.out.println(leader.getTea().getName());*/
        System.out.println(context.getBean(Leader.class).getTea().getName());
    }
}
