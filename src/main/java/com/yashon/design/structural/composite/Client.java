package com.yashon.design.structural.composite;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午1:55
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        CatalogComponent javaCourse = new Course("java课程");
        CatalogComponent cCourse = new Course("c语言课程");

        CatalogComponent computerCourseCatalog = new CourseCatalog("计算机课程");
        CatalogComponent algorithmCourse = new Course("算法课程");
        CatalogComponent designpatternCourse = new Course("设计模式课程");

        computerCourseCatalog.add(algorithmCourse);
        computerCourseCatalog.add(designpatternCourse);

        CatalogComponent courseCatalog = new CourseCatalog("课程目录");
        courseCatalog.add(javaCourse);
        courseCatalog.add(cCourse);
        courseCatalog.add(computerCourseCatalog);

        courseCatalog.display();
    }
}
