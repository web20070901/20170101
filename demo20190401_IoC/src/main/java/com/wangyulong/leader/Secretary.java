package com.wangyulong.leader;

import com.wangyulong.leader.annotation.Needs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Secretary {

   /*
   //秘书可以给任何对象倒茶
    public static void inject(Class clazz){

    }
    */

 /*   public static void inject(Leader leader){

        try {
            //获取所有方法
            Method[] methods = Leader.class.getMethods();
            //对方法进行遍历
            for(Method method:methods){
                String name = method.getName();
                //找到setWater方法执行
                if ("setWater".equals(name)){
                    //秘书创建Water对象
                    Water water = new Water();
                    //反射执行方法
                    method.invoke(leader,water);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }*/
    //降低代码之间的耦合性
    public static <T> T inject(Class<T> clazz){
        //在外部定义leader来接受值并返回
        T leader = null;
        try {
            //给创建的leader对象赋值，通过传入参数类来创建新对象并赋值给leader
            leader = clazz.newInstance();
            //获取所有方法
            Method[] methods = clazz.getMethods();
            for(Method method:methods){
                //获取方法上的Needs的注解
                Needs needs = method.getAnnotation(Needs.class);
                if (needs!=null){
                    Class teaClazz = needs.value();
                    Object tea = teaClazz.newInstance();
                    method.invoke(leader,tea);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return  leader;
    }
}
