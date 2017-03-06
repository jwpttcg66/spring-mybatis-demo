package com.snowcattle.demo.entity;

/**
 * Created by jiangwenping on 17/3/6.
 * 订单实体
 */
public class Order {

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Integer orderId;

    private Integer userId;

    private String status;
}
