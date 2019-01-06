package com.yashon.design.structural.proxy;

/**
 * @ClassName OrderDaoImpl
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午3:57
 * @Version 1.0
 **/
public class OrderDaoImpl implements OrderDao {
    public int insert(Order order) {
        System.out.println("插入order成功");
        return 1;
    }
}
