package com.yashon.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseAggregateImpl
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午7:08
 * @Version 1.0
 **/
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public CourseIterator courseIterator() {
        return new CourseIteratorImpl(courseList);
    }
    
    public void print(){
        for (Object o : courseList) {
            Course course = (Course)o;
            System.out.println(course);
        }
    }
}
