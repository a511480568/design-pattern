package com.yashon.design.behavioral.state;

/**
 * @ClassName PlayState
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:36
 * @Version 1.0
 **/
public class PlayState extends VideoState {
    @Override
    public void play() {
        System.out.println("播放视频");
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
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }
}
