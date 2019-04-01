package com.wangyulong;

import org.springframework.stereotype.Component;

@Component
public class GreenTea implements Water {
    @Override
    public String getName() {
        return "绿茶";
    }
}
