package com.yashon.design.creational.single;

/**
 * @ClassName SynchronizedClassLazySingleton
 * @Description 在类上加synchronized关键字
 * @Author yashon
 * @Date 2019/1/2 下午4:54
 * @Version 1.0
 **/
public class SynchronizedClassLazySingleton {

    private static SynchronizedClassLazySingleton instance = null;

    private SynchronizedClassLazySingleton(){

    }

    public synchronized static SynchronizedClassLazySingleton getInstance(){

        if(null == instance){
            instance = new SynchronizedClassLazySingleton();
        }

        return instance;
    }
}
