package com.wangyulong.statica;

public class PhoneFactory implements SaleProduct {
    @Override
    public String saleProduct() {
        System.out.println("正在组装手机");
        return "华为手机";
    }
}
