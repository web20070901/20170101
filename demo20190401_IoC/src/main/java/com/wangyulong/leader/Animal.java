package com.wangyulong.leader;

import com.wangyulong.leader.annotation.Needs;

public class Animal{

    private  Water water;

    /**
     * 喂水
     * @return
     */
    public Water getWater() {
        return water;
    }
@Needs(value = Coffee.class)
    public void setWater(Water water) {
        this.water = water;
    }


}
