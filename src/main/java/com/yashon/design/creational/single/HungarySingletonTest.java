package com.yashon.design.creational.single;

/**
 * @ClassName HungarySingletonTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午5:36
 * @Version 1.0
 **/
public class HungarySingletonTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                HungarySingleton instance1 = HungarySingleton.getInstance();
                System.out.println("线程1返回的实例："+ instance1);

            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                HungarySingleton instance2 = HungarySingleton.getInstance();
                System.out.println("线程2返回的实例："+ instance2);

            }
        }).start();
    }
}
