package com.yashon.design.creational.abstractfactory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/29 上午11:04
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {

        ProductFactory xiaomiProductFactory = new XiaomiProductFactory();
        BookProduct xiaomiBook = xiaomiProductFactory.produceBookProduct();
        xiaomiBook.start();
        xiaomiBook.music();

        System.out.println("------------------------");

        ProductFactory huaweiProductFactory = new HuaweiProductFactory();
        RouterProduct huaweiRouterProduct = huaweiProductFactory.produceRouterProduct();
        huaweiRouterProduct.start();
        huaweiRouterProduct.work();
        huaweiRouterProduct.shutDown();
    }
}
