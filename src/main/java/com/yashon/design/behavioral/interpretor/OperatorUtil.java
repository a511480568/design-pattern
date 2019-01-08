package com.yashon.design.behavioral.interpretor;

/**
 * @ClassName OperatorUtil
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/8 下午10:06
 * @Version 1.0
 **/
public class OperatorUtil {

    public static boolean isOperator(String s){
        return (s.equals("+") || s.equals("*"));
    }

    /**
     * 获得解释器
     * @param firstInterpreter
     * @param secondInterpreter
     * @param symbol
     * @return
     */
    public static Interpreter getInterpreter(Interpreter firstInterpreter,Interpreter secondInterpreter,String symbol){
        if(symbol.equals("+")){
            return new AddInterpreter(firstInterpreter,secondInterpreter);
        }else if(symbol.equals("*")) {
            return new MultiInterpreter(firstInterpreter,secondInterpreter);
        }
        return null;
    }
}
