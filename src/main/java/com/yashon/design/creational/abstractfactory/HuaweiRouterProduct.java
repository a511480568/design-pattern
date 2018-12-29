package com.yashon.design.creational.abstractfactory;

/**
 * @ClassName HuaweiRouterProduct
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/29 上午11:02
 * @Version 1.0
 **/
public class HuaweiRouterProduct extends RouterProduct {
    @Override
    void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    void work() {

        System.out.println("华为路由器工作");
    }

    @Override
    void shutDown() {

        System.out.println("华为路由器关闭");
    }
}
