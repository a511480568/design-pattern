package com.yashon.design.behavioral.command;

/**
 * @ClassName Video
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/9 下午11:08
 * @Version 1.0
 **/
public class Video {

    private String name;

    public Video(String name) {
        this.name = name;
    }

    public void openVideo(){
        System.out.println("打开视频：" + this.name);
    }

    public void closeVideo(){
        System.out.println("关闭视频：" + this.name);
    }
}
