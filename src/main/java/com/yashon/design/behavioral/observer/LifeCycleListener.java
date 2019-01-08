package com.yashon.design.behavioral.observer;

/**
 * @ClassName LifeCycleListener
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/8 下午10:59
 * @Version 1.0
 **/
public interface LifeCycleListener {

    void event(ObserverRunnable.RunnableEvent event);
}
