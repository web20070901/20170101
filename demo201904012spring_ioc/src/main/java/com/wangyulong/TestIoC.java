package com.wangyulong;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIoC {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Importor_IoC.class);
        Leader leader = annotationConfigApplicationContext.getBean(Leader.class);
        System.out.println(leader.getWater().getName());

    }
}
