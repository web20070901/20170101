package com.wangyulong;

import com.wangyulong.dynamic.DyComputerFactory;
import com.wangyulong.dynamic.DyPhoneFactory;
import com.wangyulong.dynamic.DyProxy;
import com.wangyulong.dynamic.DySaleAll;

import java.lang.reflect.Proxy;

public class DyUser {
    public static void main(String[] args) {
        ClassLoader classLoader = DyUser.class.getClassLoader();
        Class<?>[] interfaces = DyComputerFactory.class.getInterfaces();
        DyComputerFactory dyComputerFactory = new DyComputerFactory();
        DyPhoneFactory dyPhoneFactory = new DyPhoneFactory();
        DyProxy dyProxy = new DyProxy(dyComputerFactory);
        DySaleAll proxyInstance = (DySaleAll)Proxy.newProxyInstance(classLoader, interfaces, dyProxy);
        String product = proxyInstance.saleAll();
        System.out.println("小明"+product);
    }
}
