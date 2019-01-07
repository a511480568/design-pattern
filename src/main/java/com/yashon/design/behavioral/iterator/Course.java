package com.yashon.design.behavioral.iterator;

/**
 * @ClassName Course
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午7:06
 * @Version 1.0
 **/
public class Course {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
