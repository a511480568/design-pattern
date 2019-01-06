package com.yashon.design.structural.bridge;

/**
 * @ClassName ABCBank
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午2:49
 * @Version 1.0
 **/
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开农业银行账号");
        account.openAccount();
        return account;
    }
}
