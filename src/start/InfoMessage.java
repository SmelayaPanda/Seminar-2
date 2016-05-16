package start;

public class InfoMessage {
    public static void getInfo(){
        System.err.println("Available commands:" +
                "\n_________________________________________________________________________" +
                "\n PUSH v      ->  put 'v' on top of the stack (v - real number) " +
                "\n DEFINE a v  ->  define variable with name 'a'" +
                "\n VARPUSH a   ->  put on top of the stack defined variable 'a'" +
                "\n POP         ->  removes the top element of the stack" +
                "\n PEEK        ->  it shows the top element of the stack" +
                "\n_________________________________________________________________________" +
                "\n MATHEMATICAL OPERATION:" +
                "\n SUM         ->  returns the sum of two top elements of the stack" +
                "\n DIF         ->  returns the difference of two top elements of the stack" +
                "\n DIV         ->  returns the division of two top elements of the stack" +
                "\n MUL         ->  returns the multiply of two top elements of the stack" +
                "\n SQRT        ->  returns the square root of the top element of the stack" +
                "\n_________________________________________________________________________");

    }
}
