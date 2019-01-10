package com.yashon.design.behavioral.mediator;

/**
 * @ClassName User
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/10 下午9:39
 * @Version 1.0
 **/
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMsg(String message){
        StudyGroup.showMessage(this,message);
    }
}
