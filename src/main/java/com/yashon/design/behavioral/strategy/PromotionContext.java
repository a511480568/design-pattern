package com.yashon.design.behavioral.strategy;

/**
 * @ClassName PromotionContext
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午11:11
 * @Version 1.0
 **/
public class PromotionContext {

    private PromotionStrategy promotionStrategy;

    public PromotionContext(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void promotionExecute(){
        promotionStrategy.doPromotion();
    }
}
