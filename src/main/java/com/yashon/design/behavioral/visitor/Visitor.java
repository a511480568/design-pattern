package com.yashon.design.behavioral.visitor;

/**
 * @ClassName Visitor
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:09
 * @Version 1.0
 **/
public class Visitor implements IVisitor {
    public void visitor(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    public void visitor(CodingCourse codingCourse) {

        System.out.println("coding课程：" + codingCourse.getName() + ",价格：" + codingCourse.getPrice());
    }
}
