package com.wangyulong.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class SpringBeans {
    /**
     * spring管理第三方类可以统一管理，对象是单例的，减少对象的创建回收消耗，提升性能
     * @return
     */
    @Bean
    public Random provideRandom(){
        return  new Random(5);
    }
}
