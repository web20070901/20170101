package com.wangyulong;

import com.wangyulong.dao.IGoodsDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {

    @Autowired
    private IGoodsDAO dao;

    @Test
    public void testCase1(){
        TbGoods tbGoods = dao.queryGoodsById(5L);
        System.out.println("商品："+tbGoods.getGoodsName()+"的产地是"+tbGoods.getGoodsAddress()+"，只需要"+tbGoods.getGoodsPrice()+"元就可以入手");
    }
}
