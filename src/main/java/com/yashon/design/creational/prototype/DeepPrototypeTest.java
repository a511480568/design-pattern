package com.yashon.design.creational.prototype;

/**
 * @ClassName DeepPrototypeTest
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/3 下午1:49
 * @Version 1.0
 **/
public class DeepPrototypeTest {

    public static void main(String[] args) throws Exception {
        DeepAttachment attachment = new DeepAttachment();
        DeepReport deepReport = new DeepReport();
        deepReport.setAttachment(attachment);

        DeepReport newDeepReport = deepReport.deepClone();

        System.out.println(deepReport == newDeepReport);
        System.out.println(deepReport.getAttachment() == newDeepReport.getAttachment());
    }
}
