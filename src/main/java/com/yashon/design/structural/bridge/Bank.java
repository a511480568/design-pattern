package com.yashon.design.structural.bridge;

/**
 * @ClassName Bank
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午2:48
 * @Version 1.0
 **/
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
