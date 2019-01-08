package com.yashon.design.behavioral.interpretor;

/**
 * @ClassName MultiInterpreter
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/8 下午8:18
 * @Version 1.0
 **/
public class MultiInterpreter implements Interpreter {

    private Interpreter firstInterpreter;

    private Interpreter secondInterpreter;

    public MultiInterpreter(Interpreter firstInterpreter, Interpreter secondInterpreter) {
        this.firstInterpreter = firstInterpreter;
        this.secondInterpreter = secondInterpreter;
    }

    public int interpreter() {
        return this.firstInterpreter.interpreter() * this.secondInterpreter.interpreter();
    }

    @Override
    public String toString() {
        return "*";
    }
}
