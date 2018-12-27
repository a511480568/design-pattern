package com.yashon.design.creational.simplefactory;

/**
 * @ClassName CityRegions
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/27 下午6:20
 * @Version 1.0
 **/
public class CityRegions extends AdministrativeRegions{
    @Override
    void getArea(int code) {
        System.out.println("市级区域");
    }
}
