package command;

import java.util.Stack;

public class PEEK implements Cmd {
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        if (stack.size() >= 1) {
            Double v = stack.peek();
            System.out.println("peek -> " + v);
        } else System.out.println("the stack is empty".toUpperCase());
        return stack;
    }
}
