package com.yashon.design.structural.composite;

/**
 * @ClassName CatalogComponent
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午1:46
 * @Version 1.0
 **/
public abstract class CatalogComponent {

    public void add(CatalogComponent c){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent c){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponent c){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public void display(){
        throw new UnsupportedOperationException("不支持显示操作");
    }
}
