package metadata;

import command.Cmd;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MathematicalFactory {
    private final Map<String, Cmd> nameCmdMap = new HashMap<>();
    //private static MathematicalFactory instance = new MathematicalFactory();

    private MathematicalFactory() {
        Properties properties = new Properties();
        try (InputStream inputStream = MathematicalFactory.class.getResourceAsStream("resources/command.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            System.err.println("read error".toUpperCase());
        }
        for (String res : properties.stringPropertyNames()) {
            properties.get(res);
            try {
                Class cl = Class.forName(properties.getProperty(res));
                nameCmdMap.put(res, (Cmd) cl.newInstance());
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                System.out.println("class not reading".toUpperCase());
            }
        }
    }

    public Cmd getCmdByName(String comName) {
        return nameCmdMap.get(comName);
    }

    public static MathematicalFactory getInsance() {
        return new MathematicalFactory();
    }
}
