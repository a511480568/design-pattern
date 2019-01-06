package com.yashon.design.structural.proxy.staticproxy;

import com.yashon.design.structural.proxy.Order;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午4:22
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
        proxy.saveOrder(order);
    }
}
