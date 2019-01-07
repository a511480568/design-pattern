package com.yashon.design.behavioral.strategy;

/**
 * @ClassName DaZhePromotionStrategy
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午11:11
 * @Version 1.0
 **/
public class DaZhePromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("打折促销，满三件打八折");
    }
}
