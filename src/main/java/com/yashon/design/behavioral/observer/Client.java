package com.yashon.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Client
 * @Description 使用观察者观察线程的状态
 * @Author yashon
 * @Date 2019/1/8 下午11:14
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        new ThreadLifeCycleListener().concurrentQuery(list);
    }
}
