package Calculator.Calculator_v_0_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Evg on 19.07.2015.
 */
public class Start {
    public static double number1;
    public static double number2;
    public static String oper;
    private String star = "*****************************************";
    private String opzz = "*                + - * /                *";
    private String s1;
    private String num1;
    private String num2;

    public void start() {
        Scanner sc = new Scanner(System.in);
        Operation operation = new Operation();
        System.out.println(opzz);
        System.out.println(star);
        do {

            System.out.print("  Введите + - * / или \"х\" для выхода ");
            oper = sc.nextLine();
        }
        while (!oper.equals("-") && !oper.equals("+") && !oper.equals("/") && !oper.equals("*") && !oper.equals("x"));

        if (oper.equals("x")){
            System.err.println(" Завершение работы");
        }else{
            do {
                num1 = choose1();
            } while (num1 != "go");
            do {
                num2 = choose2();
            } while (num2 != "go");

            operation.op();
            System.out.println(star);
        }
    }

    private String choose1() {
        Scanner sc = new Scanner(System.in);
        try {
            s1 = "go";
            System.out.print("      Введите первое число: ");
            number1 = sc.nextDouble();
        } catch (InputMismatchException ex) {
            System.err.print("-->");
            s1 = "error";
        }
        return s1;
    }

    private String choose2() {
        Scanner sc = new Scanner(System.in);
        try {
            s1 = "go";
            System.out.print("      Введите второе число: ");
            number2 = sc.nextDouble();
        } catch (InputMismatchException ex) {
            System.err.print("-->");
            s1 = "error";
        }
        return s1;
    }
}
