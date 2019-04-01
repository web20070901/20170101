package com.wangyulong.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//当前注解是定义在方法上的
//需要使用元注解
@Target(ElementType.METHOD)//标识当前方法
@Retention(RetentionPolicy.RUNTIME)
public @interface AMthod {

    //需要当前的标签、定义当前的注解
    //这个时候需要元注解来进行注解
}
