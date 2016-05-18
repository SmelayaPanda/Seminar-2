package start;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main_2 {
    public static Stack<Double> stack = new Stack<>();
    public static Map<String, Double> doubleMap = new HashMap<>();

    public static void main(String[] args) throws IOException {

        /**
         * @descr (2.0) Command From txt File
         * */

        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
        StringBuilder sb = new StringBuilder();
        String[] strings = new String[3];


        try {
            try {
                int s;
                int i = 0;
                while (((s = in.read()) != -1) ) {

                    if ((char) s == ' ' || ((char) s == '\r')) {
                        String slovo = String.valueOf(sb);
                        strings[i] = String.valueOf(slovo);
                        sb.delete(0, sb.length());
                        i++;
                    }
                    if ((char) s == '\n') {
                        String clsName = "command." + strings[0].toUpperCase();
                        TypeInspection.typeInspection(clsName, strings, stack, doubleMap);
                        strings[0] = null;
                        strings[1] = null;
                        strings[2] = null;
                        sb.delete(0, sb.length());
                        i = 0;

                    } else {
                        sb.append((char) s);
                    }
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}