package com.yashon.design.creational.builder;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/30 上午11:13
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        CourseBuilder javaCourse = new JavaCourseBuilder();

        JavaTeacher teacher = new JavaTeacher(javaCourse);
        Course course = teacher.makeCourse("java", "26", "java video");
        System.out.println(course);
    }
}
