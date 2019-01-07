package com.yashon.design.behavioral.templatemethod;

/**
 * @ClassName DrawMoney
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午6:02
 * @Version 1.0
 **/
public class DrawMoney extends BankBusiness {

    @Override
    public void transact() {
        super.takeNumber();
        System.out.println("我要取钱");
        super.evaluate();
    }
}
