package com.wangyulong;

import com.wangyulong.statica.Proxy;

public class User {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        String s = proxy.saleProduct2();
        System.out.println("小红买到了"+s);
        String s1 = proxy.saleProduct();
        System.out.println("小明买到了"+s1);

    }
}
