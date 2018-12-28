package com.yashon.design.creational.factory;

/**
 * @ClassName SportsCarFactory
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/28 下午2:22
 * @Version 1.0
 **/
public class SportsCarFactory extends CarFactory {
    @Override
    ICar getCar() {
        return new SportsCar();
    }
}
