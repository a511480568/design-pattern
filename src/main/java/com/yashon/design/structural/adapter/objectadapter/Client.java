package com.yashon.design.structural.adapter.objectadapter;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午5:01
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
