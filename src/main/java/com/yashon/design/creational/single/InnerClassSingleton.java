package com.yashon.design.creational.single;

/**
 * @ClassName InnerClassSingleton
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午5:24
 * @Version 1.0
 **/
public class InnerClassSingleton {

    private static class InnerClass{
       private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton(){

    }

    public static InnerClassSingleton getInstance(){
        return InnerClass.instance;
    }
}
