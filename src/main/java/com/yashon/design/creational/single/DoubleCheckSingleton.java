package com.yashon.design.creational.single;

/**
 * @ClassName DoubleCheckSingleton
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午5:06
 * @Version 1.0
 **/
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }

        return instance;
    }
}
