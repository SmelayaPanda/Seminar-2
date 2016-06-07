package command;

import metadata.MyParam;
import metadata.MyParamAnnotation;

import java.util.Stack;

public class SUM implements Cmd {
    @MyParamAnnotation(type = MyParam.STACK)
    public Stack<Double> stack;

    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        this.stack = stack;
        if (stack.size() >= 2) {
            Double v = stack.pop() + stack.pop();
            System.out.println("summ -> " + v);
            stack.push(v);
        } else {
            System.out.println("Stack haven't two values".toUpperCase());
        }
        return stack;
    }
}
