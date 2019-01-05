package com.yashon.design.structural.adapter.objectadapter;

/**
 * @ClassName Adapter
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午5:01
 * @Version 1.0
 **/
public class Adapter implements Target {
    Adaptee adaptee = new Adaptee();
    public void request() {
        adaptee.adapteeRequest();
    }
}
