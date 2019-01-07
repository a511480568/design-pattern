package com.yashon.design.behavioral.iterator;

import java.util.List;

/**
 * @ClassName CourseIteratorImpl
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午7:10
 * @Version 1.0
 **/
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;

    private int position;

    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    public Course nextCourse() {
        System.out.println("返回课程，位置是：" + position);
        course = (Course) courseList.get(position);
        position ++;
        return course;
    }

    public boolean isLastCourse() {
        if(position < courseList.size()){
            return false;
        }
        return true;
    }
}
