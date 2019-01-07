package com.yashon.design.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PromotionStrategyFactory
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午11:31
 * @Version 1.0
 **/
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>();

    private static final EmptyPromotionStrategy EMPTY_PROMOTION_STRATEGY = new EmptyPromotionStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN,new ManjianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN,new FanxianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.DAZHE,new DaZhePromotionStrategy());
    }

    private PromotionStrategyFactory(){

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        return PROMOTION_STRATEGY_MAP.get(promotionKey) == null ? EMPTY_PROMOTION_STRATEGY :
                PROMOTION_STRATEGY_MAP.get(promotionKey);
    }

    private interface PromotionKey{
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
        String DAZHE = "DAZHE";
    }
}
