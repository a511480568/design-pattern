package com.yashon.design.behavioral.iterator;

/**
 * @ClassName CourseAggregate
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午7:07
 * @Version 1.0
 **/
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator courseIterator();
}
