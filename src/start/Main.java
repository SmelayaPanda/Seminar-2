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
 * @apiNote Java OOP Stack Calculator
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
                InfoMessage.getInfo();
            }

            //All mathematical command
            if ((inst instanceof Cmd)) {
                ((Cmd) inst).exec(stack);


                //Three special commands
            } else if ((inst instanceof DEFINE) && (strings.length >= 3)) {
                try {
                    DEFINE.exec(doubleMap, strings[1], Double.parseDouble(strings[2]));
                } catch (NumberFormatException e) {
                    System.out.println("Wrong data format" +
                            "\n DEFINE a v  ->  define real variable 'v' with name 'a'");
                }
            } else if ((inst instanceof PUSH) && (strings.length >= 2)) {
                try {
                    PUSH.exec(stack, Double.parseDouble(strings[1]));
                } catch (NoClassDefFoundError |NumberFormatException e) {
                    System.out.println("Wrong data format" +
                            "\n PUSH v  ->  put 'v' on top of the stack (v - real number) \"");
                }
            } else if ((inst instanceof VARPUSH) && (strings.length >= 2)) {
                try {

                    VARPUSH.exec(stack, doubleMap, strings[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Wrong data format" +
                            "\n VARPUSH a   ->  put on top of the stack DEFINE variable 'a'");
                }
            }
        }
    }
}


