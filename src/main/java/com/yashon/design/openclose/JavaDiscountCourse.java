package com.yashon.design.openclose;

import java.math.BigDecimal;

/**
 * @ClassName JavaDiscountCourse
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/25 下午8:00
 * @Version 1.0
 **/
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }

    public BigDecimal getOriginalPrice(){
        return super.getPrice();
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal("0.8"));
    }
}
