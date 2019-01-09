package com.yashon.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/9 下午11:11
 * @Version 1.0
 **/
public class Teacher {

    private List<Command> list = new ArrayList<Command>();

    public void addCommand(Command command){
        list.add(command);
    }

    public void executeCommand(){
        for (Command command : list) {
            command.execute();
        }
        list.clear();
    }

}
