package com.yashon.design.structural.flyweight;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午8:46
 * @Version 1.0
 **/
public class Client {

    private static final String[] departments = {"BD","PM","RD","QA","BA"};

    public static void main(String[] args) {

        for(int i = 0; i< 10; i++){
            String department = departments[(int)(Math.random() * departments.length)];
            Employee manager = EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
