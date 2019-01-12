package com.yashon.design.behavioral.state;

/**
 * @ClassName SpeedState
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:36
 * @Version 1.0
 **/
public class SpeedState extends VideoState{

    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }

    @Override
    public void speed() {
        System.out.println("视频快进");
    }
}
