package com.yashon.design.creational.single;

import java.lang.reflect.Constructor;

/**
 * @ClassName ProxySingletonTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午9:36
 * @Version 1.0
 **/
public class ProxySingletonTest {

    public static void main(String[] args)throws Exception {
        Class clazz = HungarySingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungarySingleton proxyInstance = (HungarySingleton)constructor.newInstance();

        HungarySingleton instance = HungarySingleton.getInstance();

        System.out.println(proxyInstance);
        System.out.println(instance);
    }
}
