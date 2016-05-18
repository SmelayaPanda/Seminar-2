package command;

import java.util.Map;

public class DEFINE {
    public static Map exec(Map map, String s, Double val) {
        map.put(s, val);
        System.out.println("defined var -> "+ s +" = " + val);
        return map;
    }
}
