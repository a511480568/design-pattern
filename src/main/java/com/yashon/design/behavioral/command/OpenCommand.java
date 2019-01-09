package com.yashon.design.behavioral.command;

/**
 * @ClassName OpenCommand
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/9 下午11:09
 * @Version 1.0
 **/
public class OpenCommand implements Command {

    private Video video;

    public OpenCommand(Video video) {
        this.video = video;
    }

    public void execute() {
        video.openVideo();
    }
}
