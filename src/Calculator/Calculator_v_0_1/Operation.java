package Calculator.Calculator_v_0_1;

/**
 * Created by Evg on 19.07.2015.
 */
public class Operation {
    public static String oper;

    public void slozenie() {
        double answer = Start.number1 + Start.number2;
        System.out.println("       Ответ:    " + answer);
        System.out.println("*****************************************");
    }

    public void vichetanie() {
        double answer = Start.number1 - Start.number2;
        System.out.println("       Ответ:    " + answer);
        System.out.println("*****************************************");
    }

    public void umnozhenie() {
        double answer = Start.number1 * Start.number2;
        System.out.println("       Ответ:    " + answer);
        System.out.println("*****************************************");
    }

    public void delenie() {
        double answer = Start.number1 / Start.number2;
        System.out.println("       Ответ:    " + answer);
        System.out.println("*****************************************");
    }

    public void op() {
        Operation operation = new Operation();
        if (Start.oper.equals("*"))
            operation.umnozhenie();
        else if (Start.oper.equals("/"))
            operation.delenie();
        else if (Start.oper.equals("+"))
            operation.slozenie();
        else
            operation.vichetanie();
    }

}
