package com.wangyulong.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyProxy {

    @Before("execution(public void com.wangyulong.spring.Student.study())")
    public void beforeStudy(){
        System.out.println("学习前先吃饭~~~~~");
    }

    @After("execution(public void com.wangyulong.spring.Student.study())")
    public void afterStudy(){
        System.out.println("学习完后休息休息，放松一下~~~~~~~~");
    }
}
