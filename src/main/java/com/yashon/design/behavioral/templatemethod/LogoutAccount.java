package com.yashon.design.behavioral.templatemethod;

/**
 * @ClassName LogoutAccount
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午6:03
 * @Version 1.0
 **/
public class LogoutAccount extends BankBusiness {
    @Override
    public void transact() {
        super.takeNumber();
        System.out.println("注销账户");
        super.evaluate();
    }
}
