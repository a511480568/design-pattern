package com.yashon.design.behavioral.state;

import com.yashon.design.behavioral.command.Video;

/**
 * @ClassName StopState
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:36
 * @Version 1.0
 **/
public class StopState extends VideoState{

    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        System.out.println("视频停止无法暂停");
    }

    @Override
    public void stop() {
        System.out.println("视频停止");
    }

    @Override
    public void speed() {
        System.out.println("视频停止无法快进");
    }
}
