package com.wangyulong.aop;

import org.springframework.stereotype.Component;

@Component
public class ComputerFactory implements SaleLicense {
    @Override
    public String salePhone() {
        System.out.println("手机组装中");
        return "华为P10";
    }

    @Override
    public String saleComputer() {
        System.out.println("电脑组装中");
        return "惠普笔记本";
    }
}
