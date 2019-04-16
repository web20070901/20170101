package com.wangyulong;

import com.wangyulong.info.TbGoods;
import com.wangyulong.service.IGoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestSpring {

    @Autowired
    private IGoodsService goodsService;

    @Test
    public void testCase(){
        TbGoods tbGoods = goodsService.queryGoodsById(2L);
        System.out.println(tbGoods);
        System.out.println("商品："+tbGoods.getGoodsName()+"的产地是"+tbGoods.getGoodsAddress()+"，只需要"+tbGoods.getGoodsPrice()+"元就可以入手");
    }
}
