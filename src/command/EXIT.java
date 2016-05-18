package command;

import java.util.Stack;

public class EXIT implements Cmd {

    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        System.out.println("EXIT");
        System.exit(0);
        return null;
    }
}
