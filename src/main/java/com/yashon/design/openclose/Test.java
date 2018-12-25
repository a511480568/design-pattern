package com.yashon.design.openclose;

import java.math.BigDecimal;

/**
 * @ClassName Test
 * @Description
 * <p>
 *     开闭原则：对扩展开放，对修改关闭<br/>
 *
 * </p>
 * @Author yashon
 * @Date 2018/12/25 下午8:02
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        Course course = new JavaCourse(88,"netty",new BigDecimal("99"));

        System.out.println("课程id：" + course.getId() + " 课程名称：" + course.getName() + " 课程价格：" + course.getPrice());
    }
}
