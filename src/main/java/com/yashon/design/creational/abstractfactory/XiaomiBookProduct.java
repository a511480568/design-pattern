package com.yashon.design.creational.abstractfactory;

/**
 * @ClassName XiaomiBookProduct
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/29 上午10:58
 * @Version 1.0
 **/
public class XiaomiBookProduct extends BookProduct {
    @Override
    void start() {
        System.out.println("小米笔记本开机");
    }

    @Override
    void music() {

        System.out.println("小米笔记本播放音乐");
    }
}
