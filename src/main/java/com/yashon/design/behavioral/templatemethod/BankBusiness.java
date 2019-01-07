package com.yashon.design.behavioral.templatemethod;

/**
 * @ClassName BankBusiness
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午6:00
 * @Version 1.0
 **/
public abstract class BankBusiness {

    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact();

    public void evaluate(){
        System.out.println("好评5分");
    }
}
