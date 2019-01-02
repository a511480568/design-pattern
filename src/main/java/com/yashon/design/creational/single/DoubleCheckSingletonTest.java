package com.yashon.design.creational.single;

/**
 * @ClassName DoubleCheckSingletonTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午5:06
 * @Version 1.0
 **/
public class DoubleCheckSingletonTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
                System.out.println("线程1返回的实例："+ instance1);

            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                DoubleCheckSingleton instance2 = DoubleCheckSingleton.getInstance();
                System.out.println("线程1返回的实例："+ instance2);

            }
        }).start();
    }
}
