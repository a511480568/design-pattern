package com.yashon.design.structural.decorator;

/**
 * @ClassName AbstractCake
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午3:42
 * @Version 1.0
 **/
public abstract class AbstractCake implements ICake{

    private ICake iCake;

    public AbstractCake(ICake iCake) {
        this.iCake = iCake;
    }

    public String desc() {
        return this.iCake.desc();
    }


    public int cost() {
        return this.iCake.cost();
    }
}
