package com.yashon.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName EmployeeFactory
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/5 下午8:42
 * @Version 1.0
 **/
public class EmployeeFactory {

    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Employee getManager(String department){

        Employee manager = EMPLOYEE_MAP.get(department);

        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建部门经理：" + department);
            String reportContent = department + " 汇报报告，内容如下：。。。";
            ((Manager) manager).setReportContent(reportContent);
            System.out.print(" 创建报告");
            EMPLOYEE_MAP.put(department,manager);
        }

        return manager;
    }
}
