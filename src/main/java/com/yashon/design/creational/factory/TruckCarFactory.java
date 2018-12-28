package com.yashon.design.creational.factory;

/**
 * @ClassName TruckCarFactory
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/28 下午2:21
 * @Version 1.0
 **/
public class TruckCarFactory extends CarFactory {
    @Override
    ICar getCar() {
        return new Truck();
    }
}
