package com.wangyulong.dynamic;

public class DyPhoneFactory implements DySaleAll {
    @Override
    public String saleAll() {
        System.out.println("正在组装手机");
        return "小米手机";
    }
}
