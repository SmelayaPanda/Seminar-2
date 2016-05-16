package command;

import java.util.Stack;

public interface Cmd {
    Stack<Double> exec(Stack <Double> stack);
}
