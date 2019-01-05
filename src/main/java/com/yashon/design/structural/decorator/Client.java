package com.yashon.design.structural.decorator;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午3:49
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {

        ICake iCake;
        iCake = new Cake();
        iCake = new StrawberryCake(iCake);
        iCake = new MangoCake(iCake);
        iCake = new StrawberryCake(iCake);

        System.out.println(iCake.desc() + "---" + iCake.cost());
    }
}
