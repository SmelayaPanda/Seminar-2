package command;

import java.util.Stack;

public class DIV implements Cmd {
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        if (stack.size() >= 2) {
            Double v = stack.pop() / stack.pop();
            System.out.println("divide-> " + v);
            stack.push(v);
        } else {
            System.out.println("Stack haven't two values");
        }
        return stack;
    }
}
