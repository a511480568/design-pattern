package com.yashon.design.creational.single;

/**
 * @ClassName InnerClassSingletonTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午5:25
 * @Version 1.0
 **/
public class InnerClassSingletonTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
                System.out.println("线程1返回的实例："+ instance1);

            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
                System.out.println("线程1返回的实例："+ instance2);

            }
        }).start();
    }
}
