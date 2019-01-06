package com.yashon.design.structural.bridge;

/**
 * @ClassName ICBCBank
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午2:50
 * @Version 1.0
 **/
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        account.openAccount();
        return account;
    }
}
