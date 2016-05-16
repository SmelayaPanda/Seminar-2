package command;

import java.util.Stack;

public class SUMM implements Cmd {
    @Override
    public Stack <Double> exec(Stack <Double> stack) {
        System.out.println("summ -> "+stack.push(stack.pop()+ stack.pop()));
        return stack;
    }
}
