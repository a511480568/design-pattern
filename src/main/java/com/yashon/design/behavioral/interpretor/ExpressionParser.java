package com.yashon.design.behavioral.interpretor;

import java.util.Stack;

/**
 * @ClassName ExpressionParser
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/8 下午10:04
 * @Version 1.0
 **/
public class ExpressionParser {

    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parser(String number){
        String[] split = number.split(" ");

        for (String s : split) {
            if(!OperatorUtil.isOperator(s)){
                NumberInterpreter numberInterpreter = new NumberInterpreter(s);
                stack.push(numberInterpreter);
                System.out.println(String.format("入栈:%d",numberInterpreter.interpreter()));
            }else {

                Interpreter firstInterpreter = stack.pop();
                Interpreter secondInterpreter = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d",firstInterpreter.interpreter(),secondInterpreter.interpreter()));

                Interpreter interpreter = OperatorUtil.getInterpreter(firstInterpreter, secondInterpreter, s);
                System.out.println(String.format("应用运算符:%s",interpreter));

                int result = interpreter.interpreter();

                NumberInterpreter numberInterpreter = new NumberInterpreter(result);
                stack.push(numberInterpreter);
                System.out.println(String.format("阶段结果入栈：%s",numberInterpreter.interpreter()));
            }
        }

        int res = stack.pop().interpreter();
        return res;
    }
}
