package inspection;

import command.Cmd;
import command.DEFINE;
import command.PUSH;
import command.VARPUSH;
import metadata.InfoMessage;
import metadata.MathematicalFactory;

import java.util.Map;
import java.util.Stack;

public class TypeInspectionPropFile {

    public static void typeInspection(String[] strings, Stack stack) {
        MathematicalFactory mathF = MathematicalFactory.getInsance();
        Cmd cmd = mathF.getCmdByName(strings[0]);
        cmd.exec(stack);
    }
}

