package com.yashon.design.behavioral.strategy;

/**
 * @ClassName ManjianPromotionStrategy
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午11:09
 * @Version 1.0
 **/
public class ManjianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("满减促销，满1000减200");
    }
}
