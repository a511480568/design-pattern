package com.yashon.design.behavioral;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午6:04
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        BankBusiness bankBusiness = new DrawMoney();
        bankBusiness.transact();
    }
}
