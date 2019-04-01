package com.wangyulong.reflect;

import com.wangyulong.Classroom;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) {
        //类加载（加载到内存）
        Class<Classroom> aClass = Classroom.class;
        //获取所有属性
        Field[] fields = aClass.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(field.getName());
        }


        try {
            //反射创建一个对象
            Classroom instance = aClass.newInstance();
            //获取公有方法
            Method[] methods = aClass.getMethods();
            for (Method method:methods) {
                System.out.println("方法名称"+method.getName());
                //获取方法上是否有@AMthod注解
                AMthod annotation = method.getAnnotation(AMthod.class);
                //annotation != null表示此方法上有@AMthod注解
                if (annotation != null){
                    method.invoke(instance,"千峰JAVA");
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
