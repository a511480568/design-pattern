package com.yashon.design.behavioral.visitor;

/**
 * @ClassName FreeCourse
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:05
 * @Version 1.0
 **/
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitor(this);
    }
}
