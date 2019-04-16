package com.wangyulong.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Proxy {

    @Before("execution(public * com.wangyulong.aop.ComputerFactory.*(..))")
    private void before(){
        System.out.println("销售前*********************************");
    }
    @After("execution(public * com.wangyulong.aop.ComputerFactory.*(..))")
    private void after(){
        System.out.println("销售后*********************************");
    }


}
