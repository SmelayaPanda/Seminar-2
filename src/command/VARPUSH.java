package command;

import java.util.Map;
import java.util.Stack;

public class VARPUSH {
    public static Stack exec(Stack stack, Map map, String varName) {
        stack.push(map.get(varName));
        System.out.println("variable with name '" + varName + "' pushed in stack");
        return stack;
    }
}
