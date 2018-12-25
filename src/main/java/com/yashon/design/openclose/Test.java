package com.yashon.design.openclose;

import java.math.BigDecimal;

/**
 * @ClassName Test
 * @Description
 * <p>
 *     开闭原则：对扩展开放，对修改关闭<br/>
 *     在这个例子中course接口中方法是固定的，现在要增加一个打折的方法，如果将这个方法加在course接口中，那么实现course接口的类<br/>
 *     都要去实现这个方法，如果类很多，那么修改的就越多，这就违背了开闭原则，我们可以用一个类来继承JavaCourse类，打折的方法在<br/>
 *     这个类JavaDiscountCourse中实现，这样就避免了其余的实现类都去实现Course接口中的打折方法了<br/>
 *     （有可能别的课程没有打折，那么其余的课程实现Course接口时就要对打折的方法进行空实现）
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
