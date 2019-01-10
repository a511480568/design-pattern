package com.yashon.design.behavioral.mediator;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/10 下午9:41
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        User user = new User("Lily");
        user.sendMsg("this is mediator pattern");
    }
}
