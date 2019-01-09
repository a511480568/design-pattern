package com.yashon.design.behavioral.command;

/**
 * @ClassName CloseCommand
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/9 下午11:10
 * @Version 1.0
 **/
public class CloseCommand implements Command {

    private Video video;

    public CloseCommand(Video video) {
        this.video = video;
    }

    public void execute() {
        video.closeVideo();
    }
}
