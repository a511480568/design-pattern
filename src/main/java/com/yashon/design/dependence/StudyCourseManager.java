package com.yashon.design.dependence;

/**
 * @ClassName StudyCourseManager
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/25 下午10:42
 * @Version 1.0
 **/
public class StudyCourseManager {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.study();
    }
}
