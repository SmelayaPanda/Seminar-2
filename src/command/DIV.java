package command;

import java.util.Stack;

public class DIV implements Cmd {
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        Double v = stack.pop() / stack.pop();
        System.out.println("divide-> " + v);
        stack.push(v);
        return stack;
    }
}
