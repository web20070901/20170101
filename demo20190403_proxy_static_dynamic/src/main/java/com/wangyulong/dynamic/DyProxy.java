package com.wangyulong.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DyProxy implements InvocationHandler {

    private  DySaleAll factory;

    public DyProxy(DySaleAll factory) {
        this.factory = factory;
    }

    private void beforeSale(){
        System.out.println("销售前·····");
    }
    private void afterSale(){
        System.out.println("销售后-----------");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       beforeSale();
        Object invoke = method.invoke(factory, args);
        afterSale();
        return invoke;
    }
}
