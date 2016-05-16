package command;

import java.util.DoubleSummaryStatistics;
import java.util.Stack;

public class DIF implements Cmd{
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        Double aDouble = stack.pop() - stack.pop();
        System.out.println("diference -> "+ aDouble);
        stack.push(aDouble);
        return stack;
    }
}
