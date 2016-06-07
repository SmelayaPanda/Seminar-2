package command;

import metadata.MyParam;
import metadata.MyParamAnnotation;

import java.util.Map;
import java.util.Stack;

public class PEEK implements Cmd {
    @MyParamAnnotation(type = MyParam.STACK)
    public Stack<Double> stack;

    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        this.stack = stack;
        if (stack.size() >= 1) {
            Double v = stack.peek();
            System.out.println("peek -> " + v);
        } else System.out.println("the stack is empty".toUpperCase());
        return stack;
    }
}
