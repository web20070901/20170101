package com.wangyulong.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Leader  {

    @Qualifier("bread")
    @Autowired
    private Foods food;

    @Autowired
    private Random random;

    public void eat(){
        System.out.println("leader"+random.nextInt(5));
        System.out.println("领导早上吃"+food.getName());
    }
}
