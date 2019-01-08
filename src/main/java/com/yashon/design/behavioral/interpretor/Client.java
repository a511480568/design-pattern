package com.yashon.design.behavioral.interpretor;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/8 下午10:18
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        String input = "6 100 11 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parser(input);
        System.out.println("解释器结果："+result);
    }
}
