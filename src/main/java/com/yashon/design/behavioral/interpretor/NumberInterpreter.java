package com.yashon.design.behavioral.interpretor;

/**
 * @ClassName NumberInterpreter
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/8 下午10:01
 * @Version 1.0
 **/
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number){
        this.number = Integer.valueOf(number);
    }

    public int interpreter() {
        return this.number;
    }
}
