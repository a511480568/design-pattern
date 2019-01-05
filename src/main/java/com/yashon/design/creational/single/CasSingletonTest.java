package com.yashon.design.creational.single;

/**
 * @ClassName CasSingletonTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 上午9:48
 * @Version 1.0
 **/
public class CasSingletonTest {

    public static void main(String[] args) {
        CasSingleton instance1 = CasSingleton.getInstance();
        CasSingleton instance2 = CasSingleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
