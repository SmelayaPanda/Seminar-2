package command;

import java.util.Stack;

/**
 * @implNote Classes DIF, DIV, POP, SQRT, SUM, MUL
 */
public interface Cmd {
    Stack<Double> exec(Stack<Double> stack);
}
