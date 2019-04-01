package com.wangyulong.leader;

public class Test {

    public static void main(String[] args) {
      /*
         //秘书给领导倒水
        Leader leader1 = Secretary.inject(Leader.class);
        //获取领导正在喝的水的名称
        String name = leader1.getWater().getName();
        System.out.println(name);
        */

        //简化上述实现方法
        System.out.println(Secretary.inject(Leader2.class).getWater().getName());
    }
}
