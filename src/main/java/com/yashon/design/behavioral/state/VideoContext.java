package com.yashon.design.behavioral.state;

/**
 * @ClassName VideoContext
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:34
 * @Version 1.0
 **/
public class VideoContext {

    public static final PlayState PLAY_STATE = new PlayState();
    public static final StopState STOP_STATE = new StopState();
    public static final SpeedState SPEED_STATE = new SpeedState();
    public static final PauseState PAUSE_STATE = new PauseState();
    private VideoState videoState;

    public VideoState getVideoState() {
        return videoState;
    }

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setVideoContext(this);
    }

    public void play() {
        this.videoState.play();
    }

    public void stop() {
        this.videoState.stop();
    }

    public void speed() {
        this.videoState.speed();
    }

    public void pause() {
        this.videoState.pause();
    }

}
