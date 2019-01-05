package com.yashon.design.structural.decorator;

/**
 * @ClassName StrawberryCake
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午3:45
 * @Version 1.0
 **/
public class StrawberryCake extends AbstractCake {
    public StrawberryCake(ICake iCake) {
        super(iCake);
    }

    @Override
    public String desc() {
        return super.desc() + "加草莓";
    }

    @Override
    public int cost() {
        return super.cost() + 20;
    }
}
