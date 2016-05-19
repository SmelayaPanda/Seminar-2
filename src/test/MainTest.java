package test;

import command.*;
import org.junit.Test;
import start.Main;

import java.util.Stack;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Alexey Azarov on 19.05.2016.
 */
public class MainTest {
    @Test
    public void testMain() throws Exception {
        MUL mul = new MUL();
        DIV div = new DIV();
        DIF dif = new DIF();
        SQRT sqrt = new SQRT();
        SUM sum = new SUM();
        PEEK peek = new PEEK();
        POP pop = new POP();

        // x^2 - 6 x + 8 = 0
        /*DEFINE.exec(Main.doubleMap,"a",1.0);
        DEFINE.exec(Main.doubleMap,"b",6.0);
        DEFINE.exec(Main.doubleMap,"a",8.0);*/
        double a = 1;
        double b = -6;
        double c = 8;

        //chek the first root
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

        Stack<Double> x1 = peek.exec(Main.stack);
        double xx1 = x1.peek().doubleValue();

        assertEquals(4.0, xx1);

        pop.exec(Main.stack);
        pop.exec(Main.stack);

        //check the second root
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
        dif.exec(Main.stack);
        div.exec(Main.stack);

        Stack<Double> x2 = peek.exec(Main.stack);
        double xx2 = x2.peek().doubleValue();

        assertEquals(2.0, xx2);

    }
}