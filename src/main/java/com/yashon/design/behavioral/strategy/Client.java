package com.yashon.design.behavioral.strategy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午11:18
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
//        PromotionContext christmas = new PromotionContext(new DaZhePromotionStrategy());
//        PromotionContext newYear = new PromotionContext(new FanxianPromotionStrategy());
//
//        christmas.promotionExecute();
//        newYear.promotionExecute();

        //策略模式和工厂模式结合
        String promotionKey = "MANJIAN";
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
