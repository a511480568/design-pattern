package com.yashon.design.creational.abstractfactory;

/**
 * @ClassName HuaweiBookProduct
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/29 上午11:02
 * @Version 1.0
 **/
public class HuaweiBookProduct extends BookProduct {
    @Override
    void start() {
        System.out.println("华为笔记本开机");
    }

    @Override
    void music() {

        System.out.println("华为笔记本播放音乐");
    }
}
