package com.yashon.design.creational.simplefactory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/27 下午6:25
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
//        AdministrativeRegions regions = AdministrativeRegionsFactory.getRegions(1);
//        regions.getArea(32);

        //通过反射方式
        AdministrativeRegions region = AdministrativeRegionsFactory.getRegionsByClazz(CityRegions.class);
        region.getArea(32);
    }
}
