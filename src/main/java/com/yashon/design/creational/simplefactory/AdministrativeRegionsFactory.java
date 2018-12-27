package com.yashon.design.creational.simplefactory;

/**
 * @ClassName AdministrativeRegionsFactory
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/27 下午6:19
 * @Version 1.0
 **/
public class AdministrativeRegionsFactory {

    public static AdministrativeRegions getRegions(int level){
        if(1 == level){
            return new ProvinceRegions();
        }else if(2 == level){
            return new CityRegions();
        }else if(3 == level){
            return new CountryRegions();
        }else if(4 == level){
            return new TownRegions();
        }else {
            return null;
        }
    }
}
