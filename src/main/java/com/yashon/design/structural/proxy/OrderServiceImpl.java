package com.yashon.design.structural.proxy;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午3:58
 * @Version 1.0
 **/
public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao;
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("orderService调用DAO写入order");
        return orderDao.insert(order);
    }
}
