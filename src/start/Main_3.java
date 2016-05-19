package start;

import inspection.TypeInspection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @descr (3.0) main args[] parameter
 */
public class Main_3 {

    public static Stack<Double> stack = new Stack<>();
    public static Map<String, Double> doubleMap = new HashMap<>();

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, IOException {

        /**
         * @descr (1.0) from console window
         * */

        String[] strings = new String[3];

        if (!args[0].isEmpty()) {
            strings[0] = args[0];
        }
        if (!args[1].isEmpty()) {
            strings[1] = args[1];
        }
        try {
            if (!args[2].isEmpty()) {
                strings[2] = args[2];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }

        String clsName = "command." + strings[0].toUpperCase();

        TypeInspection.typeInspection(clsName, strings, stack, doubleMap);
    }
}

