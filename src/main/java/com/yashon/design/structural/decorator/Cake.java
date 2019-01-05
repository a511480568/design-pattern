package com.yashon.design.structural.decorator;

/**
 * @ClassName Cake
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午3:43
 * @Version 1.0
 **/
public class Cake implements ICake {
    public String desc() {
        return "普通蛋糕";
    }

    public int cost() {

        return 100;
    }
}
