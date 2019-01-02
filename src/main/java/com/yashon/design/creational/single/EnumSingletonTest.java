package com.yashon.design.creational.single;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @ClassName EnumSingletonTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午10:11
 * @Version 1.0
 **/
public class EnumSingletonTest {

    public static void main(String[] args)throws Exception {
        EnumSingleton instance = EnumSingleton.getInstance();

//        Class clazz = EnumSingleton.class;
//        Constructor con = clazz.getDeclaredConstructor(String.class, int.class);
//        con.setAccessible(true);
//        EnumSingleton newInstance = (EnumSingleton)con.newInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instance_file"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("instance_file"));
        EnumSingleton newInstance = (EnumSingleton)ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
    }
}
