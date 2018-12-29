package com.yashon.design.creational.abstractfactory;

/**
 * @ClassName XiaomiProductFactory
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/29 上午10:55
 * @Version 1.0
 **/
public class XiaomiProductFactory extends ProductFactory {
    @Override
    BookProduct produceBookProduct() {
        return new XiaomiBookProduct();
    }

    @Override
    RouterProduct produceRouterProduct() {
        return new XiaomiRouterProduct();
    }
}
