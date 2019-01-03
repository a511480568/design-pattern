package com.yashon.design.creational.prototype;

import java.io.*;

/**
 * @ClassName DeepReport
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/3 下午1:46
 * @Version 1.0
 **/
public class DeepReport implements Serializable {

    private String reportName;

    private int count;

    private DeepAttachment attachment;

    public String getReportName() {
        return reportName;
    }

    public int getCount() {
        return count;
    }

    public DeepAttachment getAttachment() {
        return attachment;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setAttachment(DeepAttachment attachment) {
        this.attachment = attachment;
    }

    public DeepReport deepClone() throws Exception {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return (DeepReport)ois.readObject();
    }

    @Override
    public String toString() {
        return "DeepReport{" +
                "reportName='" + reportName + '\'' +
                ", count=" + count +
                ", attachment=" + attachment +
                '}';
    }
}
