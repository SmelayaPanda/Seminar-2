package start;

import command.Cmd;
import command.DEFINE;
import command.PUSH;
import command.VARPUSH;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Azarov Alexey
 * @version 2.2
 * @apiNote OOP Stack Calculator
 */
public class Main {
    public static Stack<Double> stack = new Stack<>();
    public static Map<String, Double> doubleMap = new HashMap<>();

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            String[] strings = s.split(" ");
            String clsName = "command." + strings[0];

            try {
                Class cl = Class.forName(clsName);
            } catch (ClassNotFoundException e) {
                System.err.println("Unknown command!".toUpperCase());
            }
            Object inst = null;
            try {
                inst = Class.forName(clsName).newInstance();
            } catch (ClassNotFoundException e) {
                System.err.println("Available commands:" +
                        "\n__________________________________________________________________" +
                        "\n PUSH v      ->  put 'v' on top of the stack (v - real number) " +
                        "\n DEFINE a v  ->  define variable with name 'a'" +
                        "\n VARPUSH a   ->  put on top of the stack defined variable 'a'" +
                        "\n POP         ->  removes the top element of the stack" +
                        "\n PEEK        ->  it shows the top element of the stack" +
                        "\n__________________________________________________________________" +
                        "\n MATHEMATICAL OPERATION:" +
                        "\n SUM         ->  returns the sum of two top elements of the stack" +
                        "\n DIF         ->  returns the difference of two top elements of the stack" +
                        "\n DIV         ->  returns the division of two top elements of the stack" +
                        "\n MUL         ->  returns the multiply of two top elements of the stack" +
                        "\n SQRT        ->  returns the square root of the top element of the stack");
            }

            if ((inst instanceof Cmd)) {
                ((Cmd) inst).exec(stack);

            } else if (inst instanceof DEFINE) {
                DEFINE.exec(doubleMap, strings[1], Double.parseDouble(strings[2]));
            } else if (inst instanceof PUSH) {
                PUSH.exec(stack, Double.parseDouble(strings[1]));
            } else if (inst instanceof VARPUSH) {
                VARPUSH.exec(stack, doubleMap, strings[1]);
            }
        }
    }
}


