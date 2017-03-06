package com.snowcattle.demo.mapper;

import com.snowcattle.demo.entity.Order;
import org.springframework.stereotype.Repository;

/**
 */
@Repository
public interface OrderMapper{
    public int insertOrder(Order address);
}
