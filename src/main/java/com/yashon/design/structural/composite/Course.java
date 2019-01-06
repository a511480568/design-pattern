package com.yashon.design.structural.composite;

/**
 * @ClassName Course
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午1:51
 * @Version 1.0
 **/
public class Course extends CatalogComponent {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    @Override
    public String getName(CatalogComponent c) {
        return this.name;
    }

    @Override
    public void display() {
        System.out.println("course name:"+name);
    }
}
