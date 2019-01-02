package com.yashon.design.creational.single;

/**
 * @ClassName HungarySingleton
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午5:35
 * @Version 1.0
 **/
public class HungarySingleton {

    private static final HungarySingleton INSTANCE = new HungarySingleton();

    private HungarySingleton(){

    }

    public static HungarySingleton getInstance(){
        return INSTANCE;
    }
}
