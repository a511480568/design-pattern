package com.yashon.design.openclose;

import java.math.BigDecimal;

/**
 * @ClassName JavaCourse
 * @Description
 * @Author yashon
 * @Date 2018/12/25 下午7:59
 * @Version 1.0
 **/
public class JavaCourse implements Course {

    private Integer id;

    private String name;

    private BigDecimal price;

    public JavaCourse(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
