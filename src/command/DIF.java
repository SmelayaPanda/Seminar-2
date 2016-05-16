package command;

import java.util.Stack;

public class DIF implements Cmd {
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        Double v = stack.pop() - stack.pop();
        System.out.println("difference -> " + v);
        stack.push(v);
        return stack;
    }
}
