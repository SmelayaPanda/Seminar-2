package command;

import java.util.Stack;

public class SUM implements Cmd {
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        if (stack.size() >= 2) {
            Double v = stack.push(stack.pop() + stack.pop());
            System.out.println("summ -> " + v);
        } else {
            System.out.println("Stack haven't two values");
        }
        return stack;
    }
}
