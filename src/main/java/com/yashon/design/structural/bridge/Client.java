package com.yashon.design.structural.bridge;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午3:02
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositeAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();
    }
}
