package com.wangyulong.statica;

public class MouseFactory implements SaleProduct2 {
    @Override
    public String saleProduct2() {
        System.out.println("正在组装鼠标");
        return "雷蛇鼠标";
    }
}
