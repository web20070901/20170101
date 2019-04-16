package com.wangyulong.coffee;

import com.wangyulong.ioc.Foods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


/**
 * Component注解中的参数：定义类的昵称（在spring）
 * 默认的名词时：类名的首字母小写后的名称
 */
@Component("bread")
public class Bread implements Foods {

    @Autowired
    private Random random;

    @Override
    public String getName() {
        return "面包"+random.nextInt(3);
    }
}
