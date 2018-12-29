package com.yashon.design.creational.abstractfactory;

/**
 * @ClassName ProductFactory
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/29 上午10:53
 * @Version 1.0
 **/
public abstract class ProductFactory {

    abstract BookProduct produceBookProduct();

    abstract RouterProduct produceRouterProduct();
}
