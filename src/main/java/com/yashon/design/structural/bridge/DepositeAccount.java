package com.yashon.design.structural.bridge;

/**
 * @ClassName DepositeAccount
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午2:47
 * @Version 1.0
 **/
public class DepositeAccount implements Account {
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositeAccount();
    }

    public void showAccountType() {

        System.out.println("这是定期账号");
    }
}
