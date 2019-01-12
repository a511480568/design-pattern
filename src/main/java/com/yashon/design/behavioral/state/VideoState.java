package com.yashon.design.behavioral.state;

/**
 * @ClassName VideoState
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:33
 * @Version 1.0
 **/
public abstract class VideoState {

    protected VideoContext videoContext;

    public void setVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    public abstract void speed();
}
