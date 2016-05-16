package command;

import java.util.Stack;

public class SQRT implements Cmd{

    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        Double aDouble =  Math.sqrt(stack.peek());
        System.out.println("sqrt -> "+aDouble);
        stack.push(aDouble);
        return stack;
    }
}
