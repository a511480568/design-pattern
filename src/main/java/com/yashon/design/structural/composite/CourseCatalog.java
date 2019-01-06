package com.yashon.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseCatalog
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午1:49
 * @Version 1.0
 **/
public class CourseCatalog extends CatalogComponent {

    private List<CatalogComponent> list = new ArrayList<CatalogComponent>();

    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent c) {
        list.add(c);
    }

    @Override
    public void remove(CatalogComponent c) {
        list.remove(c);
    }

    @Override
    public String getName(CatalogComponent c) {
        return name;
    }

    @Override
    public void display() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : list) {
            System.out.print(" ");
            catalogComponent.display();
        }
    }
}
