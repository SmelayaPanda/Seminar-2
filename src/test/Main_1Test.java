package test;

import command.*;
import org.junit.Test;
import start.Main;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Alexey Azarov on 19.05.2016.
 */
public class Main_1Test {
    @Test
    public void testMain() throws Exception {
        MUL mul = new MUL();
        DIV div = new DIV();
        DIF dif = new DIF();
        SQRT sqrt = new SQRT();
        SUM sum = new SUM();
        PEEK peek = new PEEK();
        POP pop = new POP();

        // x^2 - x + 8 = 0
        double a = 1;
        double b = -6;
        double c = 8;
        PUSH.exec(Main.stack, a);
        PUSH.exec(Main.stack, 2.0);
        mul.exec(Main.stack);
        PUSH.exec(Main.stack, a);
        PUSH.exec(Main.stack, c);
        mul.exec(Main.stack);
        PUSH.exec(Main.stack, 4.0);
        mul.exec(Main.stack);
        PUSH.exec(Main.stack, b);
        PUSH.exec(Main.stack, b);
        mul.exec(Main.stack);
        dif.exec(Main.stack);
        sqrt.exec(Main.stack);
        PUSH.exec(Main.stack, -b);
        sum.exec(Main.stack);
        div.exec(Main.stack);

        assertEquals(2.0, pop.exec(Main.stack));


    }
}