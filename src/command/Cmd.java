package command;

import java.util.Map;
import java.util.Stack;

/**
 * @implNote Classes SUM, DIF, DIV, SQRT,  MUL, POP
 */
public interface Cmd {
    Stack<Double> exec(Stack<Double> stack);
}
