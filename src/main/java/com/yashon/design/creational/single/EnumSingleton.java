package com.yashon.design.creational.single;

/**
 * @ClassName EnumSingleton
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/2 下午10:10
 * @Version 1.0
 **/
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
