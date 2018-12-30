package com.yashon.design.creational.builder.v2;

/**
 * @ClassName Test
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/30 上午11:36
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java课程").buildCourseVideo("Java视频").makeCourse();

        System.out.println(course);
    }
}
