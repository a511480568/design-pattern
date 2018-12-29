package com.yashon.design.creational.abstractfactory;

/**
 * @ClassName XiaomiRouterProduct
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/29 上午10:59
 * @Version 1.0
 **/
public class XiaomiRouterProduct extends RouterProduct {
    @Override
    void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    void work() {

        System.out.println("小米路由器工作");
    }

    @Override
    void shutDown() {

        System.out.println("小米路由器关闭");
    }
}
