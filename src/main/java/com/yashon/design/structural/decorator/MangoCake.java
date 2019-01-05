package com.yashon.design.structural.decorator;

/**
 * @ClassName MangoCake
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午3:48
 * @Version 1.0
 **/
public class MangoCake extends AbstractCake {
    public MangoCake(ICake iCake) {
        super(iCake);
    }

    @Override
    public String desc() {
        return super.desc() + "加芒果";
    }

    @Override
    public int cost() {
        return super.cost() + 15;
    }
}
