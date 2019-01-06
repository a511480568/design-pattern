package com.yashon.design.structural.proxy;

/**
 * @ClassName Order
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午3:56
 * @Version 1.0
 **/
public class Order {

    private Object orderInfo;

    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
