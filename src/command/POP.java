package command;

import java.util.Stack;

public class POP implements Cmd {
    @Override
    public  Stack exec(Stack stack) {
        System.out.println(stack.pop() + " kicked");
        return stack;
    }
}
