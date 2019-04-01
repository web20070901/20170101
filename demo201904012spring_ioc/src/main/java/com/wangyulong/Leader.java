package com.wangyulong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Leader {

    private Water water;

    public Water getWater() {
        return water;
    }

    @Autowired
    public void setWater(Water water) {
        this.water = water;
    }
}
