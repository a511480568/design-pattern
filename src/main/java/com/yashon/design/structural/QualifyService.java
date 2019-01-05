package com.yashon.design.structural;

/**
 * @ClassName QualifyService
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午1:54
 * @Version 1.0
 **/
public class QualifyService {

    public boolean qualify(PointGift gift){

        System.out.println("礼物：" + gift.getName() + "可以进行兑换");

        return Boolean.TRUE;
    }
}
