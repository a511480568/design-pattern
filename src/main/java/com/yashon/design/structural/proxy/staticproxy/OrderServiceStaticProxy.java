package com.yashon.design.structural.proxy.staticproxy;

import com.yashon.design.structural.proxy.Order;
import com.yashon.design.structural.proxy.OrderService;
import com.yashon.design.structural.proxy.OrderServiceImpl;

/**
 * @ClassName OrderServiceStaticProxy
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午4:14
 * @Version 1.0
 **/
public class OrderServiceStaticProxy {

    private OrderService orderService;

    public int saveOrder(Order order){
        orderService = new OrderServiceImpl();
        beforeMethod();
        int userId = order.getUserId();

        int dbRouter = userId % 2;
        System.out.println("取出db路由：" + dbRouter);
        afterMethod();
        return orderService.saveOrder(order);
    }

    private void beforeMethod(){
        System.out.println("静态代理方法之前");
    }

    private void afterMethod(){
        System.out.println("静态代理方法之后");
    }
}
