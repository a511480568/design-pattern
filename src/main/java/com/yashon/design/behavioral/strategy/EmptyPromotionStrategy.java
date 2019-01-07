package com.yashon.design.behavioral.strategy;

/**
 * @ClassName EmptyPromotionStrategy
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午11:30
 * @Version 1.0
 **/
public class EmptyPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动...");
    }
}
