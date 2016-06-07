package command;

import metadata.MyParam;
import metadata.MyParamAnnotation;

import java.util.Map;
import java.util.Stack;

public class POP implements Cmd {
    @MyParamAnnotation(type = MyParam.STACK)
    public Stack<Double> stack;

    @Override
    public Stack exec(Stack stack) {
        this.stack = stack;
        if (stack.size() >= 1) {
            System.out.println(stack.pop() + " kicked");
        } else {
            System.out.println("the stack is empty".toUpperCase());
        }
        return stack;
    }
}
