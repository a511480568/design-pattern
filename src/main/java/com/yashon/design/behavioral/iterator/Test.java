package com.yashon.design.behavioral.iterator;

/**
 * @ClassName Test
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/7 下午7:13
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        Course course1 = new Course("java");
        Course course2 = new Course("python");
        Course course3 = new Course("c");

        CourseAggregate aggregate = new CourseAggregateImpl();
        aggregate.addCourse(course1);
        aggregate.addCourse(course2);
        aggregate.addCourse(course3);
        ((CourseAggregateImpl) aggregate).print();

        CourseIterator courseIterator = aggregate.courseIterator();
        Course next = courseIterator.nextCourse();
        System.out.println(next);
    }
}
