package com.project.test;

import com.project.entity.OrderEntity;
import com.project.service.IOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:applicationContext.xml")
public class OrderTest {
    @Resource
    private IOrderService service;

    @Test
    public  void test(){
        int shopId=1;
        int soldNum=20;
        service.addOrder(new OrderEntity(shopId,soldNum));
        service.updateShopNum(shopId,soldNum);
    }
}
