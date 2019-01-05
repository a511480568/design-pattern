package com.yashon.design.structural.flyweight;

/**
 * @ClassName Manager
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午8:41
 * @Version 1.0
 **/
public class Manager implements Employee {
    public void report() {
        System.out.println(reportContent);
    }

    private String department;

    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
