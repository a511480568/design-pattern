package com.yashon.design.structural.bridge;

/**
 * @ClassName SavingAccount
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午2:48
 * @Version 1.0
 **/
public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    public void showAccountType() {

        System.out.println("这是活期账号");
    }
}
