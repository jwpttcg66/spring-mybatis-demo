package com.snowcattle.demo.service;

import com.snowcattle.demo.entity.Order;
import com.snowcattle.demo.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
 * Created by jiangwenping on 17/3/6.
 */

@Service
public class OrderService {

//    @Autowired
    private OrderMapper orderMapper;

    public void insertOrder(Order order){
        orderMapper.insertOrder(order);
    }
}
