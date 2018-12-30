package com.yashon.design.creational.builder;

/**
 * @ClassName JavaCourseBuilder
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/30 上午11:08
 * @Version 1.0
 **/
public class JavaCourseBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    void buildCourseName(String courseName) {

        course.setCourseName(courseName);
    }

    @Override
    void buildCoursePrice(String coursePrice) {

        course.setCoursePrice(coursePrice);
    }

    @Override
    void buildCourseVideo(String courseVideo) {

        course.setCourseVideo(courseVideo);
    }

    @Override
    Course makeCourse() {
        return course;
    }
}
