package com.yashon.design.behavioral.mediator;

import java.util.Date;

/**
 * @ClassName StudyGroup
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/10 下午9:38
 * @Version 1.0
 **/
public class StudyGroup {

    public static void showMessage(User user,String message){
        System.out.println(new Date().toString() + "[" + user.getName() + "]" + message);
    }
}
