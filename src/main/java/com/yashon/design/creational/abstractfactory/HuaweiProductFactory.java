package com.yashon.design.creational.abstractfactory;

/**
 * @ClassName HuaweiProductFactory
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/29 上午11:01
 * @Version 1.0
 **/
public class HuaweiProductFactory extends ProductFactory {
    @Override
    BookProduct produceBookProduct() {
        return new HuaweiBookProduct();
    }

    @Override
    RouterProduct produceRouterProduct() {
        return new HuaweiRouterProduct();
    }
}
