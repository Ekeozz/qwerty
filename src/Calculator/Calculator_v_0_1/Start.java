package Calculator.Calculator_v_0_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Evg on 19.07.2015.
 */
public class Start {
    public static double number1;
    public static double number2;
    public static String oper;

    public void start() {
        Scanner sc = new Scanner(System.in);
        // Operation operation = new Operation();
        System.out.println("*                + - * /                *");
        System.out.println("*****************************************");
            System.out.print("    Какую операцию выполнить?  ");
            oper = sc.nextLine();



        try {
            System.out.print("      Введите первое число: ");
            number1 = sc.nextDouble();
            System.out.print("      Введите второе число: ");
            number2 = sc.nextDouble();
        } catch (InputMismatchException ex) {
            System.err.println("Введён неправельный символ");
       }
    }
}
