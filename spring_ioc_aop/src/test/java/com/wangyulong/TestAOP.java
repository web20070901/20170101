package com.wangyulong;

import com.wangyulong.aop.Proxy;
import com.wangyulong.aop.SaleLicense;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestAOP {

    @Autowired
    private SaleLicense proxy;

    @Test
    public void testCase(){
        String computer = proxy.saleComputer();
        System.out.println("小红买了1台"+computer);
    }
}
