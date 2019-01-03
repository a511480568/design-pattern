package com.yashon.design.creational.prototype;

/**
 * @ClassName Report
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/3 上午11:53
 * @Version 1.0
 **/
public class Report implements Cloneable{

    private Attachment attachment;

    private String reportName;

    private int count;

    public Attachment getAttachment() {
        return attachment;
    }

    public String getReportName() {
        return reportName;
    }

    public int getCount() {
        return count;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    protected Report clone() throws CloneNotSupportedException {

        Object obj = null;
        obj = super.clone();
        return (Report)obj;
    }

    @Override
    public String toString() {
        return "Report{" +
                "attachment=" + attachment +
                ", reportName='" + reportName + '\'' +
                ", count=" + count +
                '}';
    }
}
