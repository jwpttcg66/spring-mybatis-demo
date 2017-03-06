package com.snowcattle.demo;

import com.snowcattle.demo.entity.Order;
import com.snowcattle.demo.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jiangwenping on 17/3/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:db_applicationContext.xml")
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void test(){
        Order order = new Order();
        order.setOrderId(Integer.MAX_VALUE);
        order.setUserId(1);
        order.setStatus("测试最大数据");
        orderService.insertOrder(order);
    }
}
