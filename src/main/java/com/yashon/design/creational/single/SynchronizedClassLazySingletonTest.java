package com.yashon.design.creational.single;

/**
 * @ClassName SynchronizedClassLazySingletonTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午4:55
 * @Version 1.0
 **/
public class SynchronizedClassLazySingletonTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                SynchronizedClassLazySingleton instance1 = SynchronizedClassLazySingleton.getInstance();
                System.out.println("线程1返回的实例："+ instance1);

            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                SynchronizedClassLazySingleton instance2 = SynchronizedClassLazySingleton.getInstance();
                System.out.println("线程1返回的实例："+ instance2);

            }
        }).start();
    }
}
