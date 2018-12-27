package com.yashon.design.creational.simplefactory;

/**
 * @ClassName ProvinceRegions
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/27 下午6:19
 * @Version 1.0
 **/
public class ProvinceRegions extends AdministrativeRegions{
    @Override
    void getArea(int code) {
        System.out.println("省级区域");
    }
}
