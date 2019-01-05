package com.yashon.design.structural.adapter.classadapter;

/**
 * @ClassName Adapter
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午5:01
 * @Version 1.0
 **/
public class Adapter extends Adaptee implements Target {
    public void request() {
        super.adapteeRequest();
    }
}
