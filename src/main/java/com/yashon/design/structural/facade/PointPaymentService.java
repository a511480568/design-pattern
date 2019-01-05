package com.yashon.design.structural.facade;

/**
 * @ClassName PointPaymentService
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午1:57
 * @Version 1.0
 **/
public class PointPaymentService {

    public boolean pay(PointGift gift){
        System.out.println("礼物：" + gift.getName() + "积分足够可以兑换");
        return Boolean.TRUE;
    }
}
