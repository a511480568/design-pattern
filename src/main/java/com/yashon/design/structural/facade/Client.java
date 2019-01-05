package com.yashon.design.structural.facade;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午2:03
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {

        PointGift gift = new PointGift("T-shirt");

        PointGiftFacade facade = new PointGiftFacade();
        facade.exchangeGift(gift);
    }
}
