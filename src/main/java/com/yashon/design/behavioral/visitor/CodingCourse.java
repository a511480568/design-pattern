package com.yashon.design.behavioral.visitor;

/**
 * @ClassName CodingCourse
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/12 上午10:07
 * @Version 1.0
 **/
public class CodingCourse extends Course {

    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitor(this);
    }
}
