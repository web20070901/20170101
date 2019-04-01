package com.wangyulong.leader;

import com.wangyulong.leader.annotation.Needs;

/**
 * 领导
 */
public class Leader {
    /**
     * 龙井茶
     * 茉莉花茶
     * 大红袍茶
     * 普尔
     * 咖啡
     */
    private Water water;

    public Water getWater() {
        return water;
    }
    @Needs(value = RedTea.class)
    public void setWater(Water water) {
        this.water = water;
    }
}
