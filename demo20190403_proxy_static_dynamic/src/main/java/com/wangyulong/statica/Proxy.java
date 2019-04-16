package com.wangyulong.statica;

public class Proxy implements SaleProduct,SaleProduct2{

    private void beforeSale(){
        System.out.println("售前");
    }

    private void afterSale(){
        System.out.println("售后");
    }

    @Override
    public String saleProduct() {
        beforeSale();
        String product = new PhoneFactory().saleProduct();
        afterSale();
        return product;
    }

    @Override
    public String saleProduct2() {
        beforeSale();
        String product2 = new MouseFactory().saleProduct2();
        afterSale();
        return product2;
    }
}
