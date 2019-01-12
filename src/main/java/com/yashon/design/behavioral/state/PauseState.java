package com.yashon.design.behavioral.state;

/**
 * @ClassName PauseState
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:36
 * @Version 1.0
 **/
public class PauseState extends VideoState{

    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        System.out.println("视频暂停");
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }

    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }
}
