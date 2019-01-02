package com.yashon.design.creational.single;

import java.io.*;

/**
 * @ClassName SeriaSingletonTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午7:47
 * @Version 1.0
 **/
public class SeriaSingletonTest {

    public static void main(String[] args)throws Exception {
        HungarySingleton instance = HungarySingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instance_file"));
        oos.writeObject(instance);

        File file = new File("instance_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungarySingleton newInstance = (HungarySingleton)ois.readObject();

        System.out.println("单例模式instance：" + instance);
        System.out.println("序列化instance:" + newInstance);
        System.out.println(instance == newInstance);
    }
}
