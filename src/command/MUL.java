package command;

import java.util.Stack;

public class MUL implements Cmd {
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        Double v = stack.pop() * stack.pop();
        System.out.println("multiply -> " + v);
        return stack;
    }
}
