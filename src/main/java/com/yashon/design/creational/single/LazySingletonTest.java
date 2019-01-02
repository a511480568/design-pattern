package com.yashon.design.creational.single;

/**
 * @ClassName LazySingletonTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午4:04
 * @Version 1.0
 **/
public class LazySingletonTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("----------以下是多线程测试懒汉式----------");

        new Thread(new Runnable() {
            public void run() {
                try {
                    LazySingleton instance1 = LazySingleton.getInstance();
                    System.out.println("线程1返回的实例："+ instance1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    LazySingleton instance2 = LazySingleton.getInstance();
                    System.out.println("线程1返回的实例："+ instance2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
