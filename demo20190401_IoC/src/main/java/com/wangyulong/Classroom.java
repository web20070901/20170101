package com.wangyulong;

import com.wangyulong.reflect.AMthod;

/**
 * 教室
 */
public class Classroom {
    /**
     * 课桌，是教室的一个依赖
     *
     * 依赖注入;给desk赋值（只不过这个赋值的方式有点特别）
     */
    private Desk desk;

    private String color="红色";

    @AMthod
    public void setColor(String color) {
        System.out.println("----------------"+color);
        this.color = color;
    }
    @AMthod
    public void cccc(String color) {
        System.out.println("》》》》》》》》》》"+color);
    }
}
