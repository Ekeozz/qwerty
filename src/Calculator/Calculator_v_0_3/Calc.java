package Calculator.Calculator_v_0_3;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Evg on 23.07.2015. Calculator_v_0_3
 */
public class Calc {
    public static String oper;
    protected String num;

    public void start() {
        Scanner sc = new Scanner(System.in);
        Methods methods = new Methods();
        do {
            System.out.print("  Введите + - * / или \"х\" для выхода ");
            oper = sc.nextLine();
        }
        while (!oper.equals("-") && !oper.equals("+") && !oper.equals("/") && !oper.equals("*") && !oper.equals("x"));

        if (oper.equals("x")) {
            System.err.println("  Завершение работы");
        } else {
            do {
                num = methods.choose1();
            } while (!Objects.equals(num, "go"));
            do {
                num = methods.choose2();
            } while (!Objects.equals(num, "go"));
            methods.op();
        }
    }

    protected void stop() {
        System.out.println("*****************************************");
    }

}
