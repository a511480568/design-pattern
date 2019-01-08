package com.yashon.design.behavioral.observer;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadLifeCycleListener
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/8 下午11:06
 * @Version 1.0
 **/
public class ThreadLifeCycleListener implements LifeCycleListener {

    private final Object LOCK = new Object();

    public void concurrentQuery(List<String> ids){

        if(ids.isEmpty() || null == ids){
            return;
        }

        for (String id : ids) {

            new Thread(new ObserverRunnable(this) {
                public void run() {
                    try{
                        notifyChange(new RunnableEvent(RunnableState.RUNNING,null,Thread.currentThread()));
                        TimeUnit.SECONDS.sleep(1L);
                        notifyChange(new RunnableEvent(RunnableState.DONE,null,Thread.currentThread()));
                    }catch (Exception e){
                        notifyChange(new RunnableEvent(RunnableState.ERROR,e.getCause(),Thread.currentThread()));
                    }
                }
            },id).start();

        }
    }

    public void event(ObserverRunnable.RunnableEvent event) {
        synchronized (LOCK){
            System.out.println("The runnable [" + event.getThread().getName() + "] data changed and state is [" + event.getState() + "]");

            if(event.getThrowable() != null){
                System.out.println("the runnable [" + event.getThread().getName() + "] process failed");
                event.getThrowable().printStackTrace();
            }
        }
    }
}
