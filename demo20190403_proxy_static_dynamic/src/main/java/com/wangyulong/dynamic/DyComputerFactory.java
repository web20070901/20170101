package com.wangyulong.dynamic;

public class DyComputerFactory implements DySaleAll {
    @Override
    public String saleAll() {
        System.out.println("正在组装电脑");
        return "华硕笔记本";
    }
}
