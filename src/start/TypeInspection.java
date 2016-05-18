package start;

import command.Cmd;
import command.DEFINE;
import command.PUSH;
import command.VARPUSH;

import java.util.Map;
import java.util.Stack;

public class TypeInspection {

    public static void typeInspection(String clsName, String[] strings, Stack stack, Map doubleMap) {
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
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        //All mathematical command
        if ((inst instanceof Cmd)) {
            ((Cmd) inst).exec(stack);

            //Three special commands
        } else if ((inst instanceof DEFINE) && (strings[1]!=null)&&(strings[2]!=null)) {
            try {
                DEFINE.exec(doubleMap, strings[1], Double.parseDouble(strings[2]));
            } catch (NumberFormatException e) {
                System.out.println("Wrong data format" +
                        "\n use |DEFINE a v|  ->  define real variable 'v' with name 'a'");
            }
        } else if ((inst instanceof PUSH) && (strings[1]!=null)) {
            try {
                PUSH.exec(stack, Double.parseDouble(strings[1]));
            } catch (NoClassDefFoundError | NumberFormatException e) {
                System.out.println("Wrong data format" +
                        "\n use |PUSH v|  ->  put 'v' on top of the stack (v - real number) \"");
            }
        } else if ((inst instanceof VARPUSH) && (strings[1]!=null)) {
            try {

                VARPUSH.exec(stack, doubleMap, strings[1]);
            } catch (NumberFormatException e) {
                System.out.println("Wrong data format" +
                        "\n use |VARPUSH a|   ->  put on top of the stack DEFINE variable 'a'");

            }
        }

    }
}
