package com.yashon.design.creational.builder;

/**
 * @ClassName CourseBuilder
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/30 上午11:06
 * @Version 1.0
 **/
public abstract class CourseBuilder {

    abstract void buildCourseName(String courseName);

    abstract void buildCoursePrice(String coursePrice);

    abstract void buildCourseVideo(String courseVideo);

    abstract Course makeCourse();
}
