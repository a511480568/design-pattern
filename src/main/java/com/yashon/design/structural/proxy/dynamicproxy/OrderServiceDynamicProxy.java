package com.yashon.design.structural.proxy.dynamicproxy;

import com.yashon.design.structural.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName OrderServiceDynamicProxy
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/6 下午4:45
 * @Version 1.0
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }

    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理增强之前计算分库");

        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("取出db路由：" + dbRouter);
    }

    private void afterMethod(){
        System.out.println("动态带增强之后执行方法...");
    }
}
