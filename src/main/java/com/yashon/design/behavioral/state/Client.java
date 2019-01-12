package com.yashon.design.behavioral.state;

/**
 * @ClassName Client
 * @Description
 * <p>
 *     视频有播放、暂停、停止的状态，停止的状态是无法快进、快退的
 * </p>
 * @Author yashon
 * @Date 2019/1/12 上午10:32
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        VideoContext context = new VideoContext();
        context.setVideoState(new PlayState());

        System.out.println("当前状态："+context.getVideoState().getClass().getSimpleName());

        context.pause();
        System.out.println("当前状态："+context.getVideoState().getClass().getSimpleName());

        context.speed();
        System.out.println("当前状态："+context.getVideoState().getClass().getSimpleName());

        context.stop();
        System.out.println("当前状态："+context.getVideoState().getClass().getSimpleName());

        context.speed();
    }
}
