package com.yashon.design.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Clinet
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:12
 * @Version 1.0
 **/
public class Clinet {

    public static void main(String[] args) {
        List<Course> list = new ArrayList<Course>();

        Course freeCourse = new FreeCourse();
        freeCourse.setName("Java");

        Course codingCourse = new CodingCourse();
        codingCourse.setName("C++");
        ((CodingCourse) codingCourse).setPrice("20");

        list.add(freeCourse);
        list.add(codingCourse);

        for (Course course : list) {
            course.accept(new Visitor());
        }
    }
}
