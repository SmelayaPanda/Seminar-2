package command;

import java.util.Stack;

public class SQRT implements Cmd {

    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        if (stack.size() >= 1) {
            Double v = Math.sqrt(stack.peek());
            System.out.println("sqrt -> " + v);
            stack.push(v);
        } else System.out.println("the stack is empty".toUpperCase());
            return stack;
    }
}
