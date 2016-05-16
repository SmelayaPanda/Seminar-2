package command;

import java.util.Stack;

public class PEEK implements Cmd {
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        Double v = stack.peek();
        System.out.println("peek -> " + v);
        return stack;
    }
}
