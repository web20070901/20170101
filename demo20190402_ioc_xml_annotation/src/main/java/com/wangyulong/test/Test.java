package com.wangyulong.test;

import com.wangyulong.ioc.Leader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Leader bean = classPathXmlApplicationContext.getBean(Leader.class);
        bean.eat();
    }
}
