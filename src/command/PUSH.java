package command;

import java.util.Stack;

public class PUSH {
    public static Stack exec(Stack stack, Double value) {
        stack.push(value);
        System.out.println("push -> " + value);
        return stack;
    }
}
