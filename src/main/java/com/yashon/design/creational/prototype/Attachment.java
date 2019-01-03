package com.yashon.design.creational.prototype;

/**
 * @ClassName Attachment
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/3 上午11:52
 * @Version 1.0
 **/
public class Attachment {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "name='" + name + '\'' +
                '}';
    }
}
