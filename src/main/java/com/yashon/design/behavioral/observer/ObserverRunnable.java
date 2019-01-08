package com.yashon.design.behavioral.observer;

/**
 * @ClassName ObserverRunnable
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/8 下午11:00
 * @Version 1.0
 **/
public abstract class ObserverRunnable implements Runnable {

    final LifeCycleListener listener;

    public ObserverRunnable(LifeCycleListener listener) {
        this.listener = listener;
    }

    protected void notifyChange(RunnableEvent event){
        listener.event(event);
    }


    public enum RunnableState{
        RUNNING,ERROR,DONE;
    }

    public static class RunnableEvent{
        final RunnableState state;

        final Throwable throwable;

        final Thread thread;

        public RunnableEvent(RunnableState state, Throwable throwable, Thread thread) {
            this.state = state;
            this.throwable = throwable;
            this.thread = thread;
        }

        public RunnableState getState() {
            return state;
        }

        public Throwable getThrowable() {
            return throwable;
        }

        public Thread getThread() {
            return thread;
        }
    }
}
