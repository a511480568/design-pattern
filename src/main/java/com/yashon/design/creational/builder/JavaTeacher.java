package com.yashon.design.creational.builder;

/**
 * @ClassName JavaTeacher
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/30 上午11:11
 * @Version 1.0
 **/
public class JavaTeacher {

    private CourseBuilder courseBuilder;

    public JavaTeacher(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePrice,String courseVideo){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePrice(coursePrice);
        courseBuilder.buildCourseVideo(courseVideo);
        return courseBuilder.makeCourse();
    }
}
