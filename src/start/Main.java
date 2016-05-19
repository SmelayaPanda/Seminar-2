package start;

import inspection.TypeInspection;
import inspection.TypeInspectionPropFile;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author Azarov Alexey
 * @version 2.2
 * @apiNote Java OOP Stack Calculator
 */
public class Main {
    public static Stack<Double> stack = new Stack<>();
    public static Map<String, Double> doubleMap = new HashMap<>();

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, IOException {

        /**
         * @descr (1.0) from console window
         * */
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            String[] strings = s.split(" ");
            String clsName = "command." + strings[0].toUpperCase();

          TypeInspection.typeInspection(clsName, strings, stack, doubleMap);

           // TypeInspectionPropFile.typeInspection(strings, stack);

        }
    }
}


