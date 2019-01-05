package com.yashon.design.creational.single;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName CasSingleton
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 上午9:44
 * @Version 1.0
 **/
public class CasSingleton {

    private static final AtomicReference<CasSingleton> INSTANCE = new AtomicReference<CasSingleton>();

    private CasSingleton(){

    }

    public static CasSingleton getInstance(){

        for(;;){
            CasSingleton instance = INSTANCE.get();
            if(null != instance){
                return instance;
            }
            instance = new CasSingleton();
            if(INSTANCE.compareAndSet(null,instance)){
                return instance;
            }
        }
    }
}
