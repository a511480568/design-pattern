package com.yashon.design.creational.factory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/28 下午2:22
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {

        CarFactory sportsCar = new SportsCarFactory();
        sportsCar.getCar().car();

        CarFactory truckCar = new TruckCarFactory();
        truckCar.getCar().car();
    }
}
