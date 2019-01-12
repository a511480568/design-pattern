package com.yashon.design.behavioral.visitor;

/**
 * @ClassName Course
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:04
 * @Version 1.0
 **/
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
