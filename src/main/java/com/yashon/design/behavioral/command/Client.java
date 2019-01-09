package com.yashon.design.behavioral.command;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/9 下午11:14
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {

        Video video = new Video("火影忍者");
        OpenCommand openCommand = new OpenCommand(video);
        CloseCommand closeCommand = new CloseCommand(video);

        Teacher teacher = new Teacher();
        teacher.addCommand(openCommand);
        teacher.addCommand(closeCommand);
        teacher.executeCommand();
    }
}
