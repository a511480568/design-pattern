package com.yashon.design.creational.single;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName LazySingleton
 * @Description 懒汉式
 * @Author yashon
 * @Date 2019/1/2 下午4:01
 * @Version 1.0
 **/
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance() throws InterruptedException {

        if(null == instance){
            TimeUnit.MILLISECONDS.sleep(1000L);
            instance = new LazySingleton();
        }

        return instance;
    }
}
