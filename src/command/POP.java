package command;

import java.util.Stack;

public class POP implements Cmd {
    @Override
    public Stack exec(Stack stack) {
        if (stack.size() >= 1) {
            System.out.println(stack.pop() + " kicked");
        } else {
            System.out.println("the stack is empty".toUpperCase());
        }
        return stack;
    }
}
