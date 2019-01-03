package com.yashon.design.creational.prototype;

/**
 * @ClassName ShallowPrototypeTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/3 上午11:52
 * @Version 1.0
 **/
public class ShallowPrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Attachment attachment = new Attachment();
        Report report = new Report();
        report.setAttachment(attachment);

        Report newReport = report.clone();

        System.out.println(report == newReport);
        System.out.println(report.getAttachment() == newReport.getAttachment());
    }
}
