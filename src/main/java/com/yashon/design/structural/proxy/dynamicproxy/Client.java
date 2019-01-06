package com.yashon.design.structural.proxy.dynamicproxy;

import com.yashon.design.structural.proxy.Order;
import com.yashon.design.structural.proxy.OrderService;
import com.yashon.design.structural.proxy.OrderServiceImpl;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午4:52
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderService service = (OrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        service.saveOrder(order);
    }
}
