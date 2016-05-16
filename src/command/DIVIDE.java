package command;

import java.util.DoubleSummaryStatistics;
import java.util.Stack;

public class DIVIDE implements Cmd {
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        Double aDouble = stack.pop() / stack.pop();
        System.out.println("divide-> "+aDouble);
        stack.push(aDouble);
        return stack;
    }
}
