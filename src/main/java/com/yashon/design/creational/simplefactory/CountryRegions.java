package com.yashon.design.creational.simplefactory;

/**
 * @ClassName CountryRegions
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/27 下午6:20
 * @Version 1.0
 **/
public class CountryRegions extends AdministrativeRegions{
    @Override
    void getArea(int code) {
        System.out.println("县级区域");
    }
}
