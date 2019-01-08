package com.yashon.design.behavioral.interpretor;

/**
 * @ClassName AddInterpreter
 * @Description TODO
 * @Author yashon
 * @Date 2019/1/8 下午8:16
 * @Version 1.0
 **/
public class AddInterpreter implements Interpreter{

    private Interpreter firstInterpreter;

    private Interpreter secondInterpreter;

    public AddInterpreter(Interpreter firstInterpreter, Interpreter secondInterpreter) {
        this.firstInterpreter = firstInterpreter;
        this.secondInterpreter = secondInterpreter;
    }

    public int interpreter() {
        return this.firstInterpreter.interpreter() + this.secondInterpreter.interpreter();
    }

    @Override
    public String toString() {
        return "+";
    }
}
