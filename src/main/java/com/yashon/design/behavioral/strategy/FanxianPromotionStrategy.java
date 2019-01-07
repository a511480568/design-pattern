package com.yashon.design.behavioral.strategy;

/**
 * @ClassName FanxianPromotionStrategy
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午11:10
 * @Version 1.0
 **/
public class FanxianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("返现促销，满1000返现100");
    }
}
