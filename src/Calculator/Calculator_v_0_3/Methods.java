package Calculator.Calculator_v_0_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Evg on 23.07.2015. Calculator_v_0_3
 */
public class Methods {

    public double answer;
    public int answerInt;
    private String s1;
    public static double number1;
    public static double number2;


    void head() {
        System.out.println("*****************************************");
        System.out.println("*            Calculator ver.0.3         *");
        System.out.println("*---------------------------------------*");
        System.out.println("*                +  -  *  /             *");
        System.out.println("*****************************************");
    }

    public String choose1() {
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

    public String choose2() {
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

    public void op() {
        switch (Calc.oper) {
            case "*":
                answer = number1 * number2;
                an(answer);
                break;
            case "/":
                answer = number1 / number2;
                an(answer);
                break;
            case "+":
                answer = number1 + number2;
                an(answer);
                break;
            default:
                answer = number1 - number2;
                an(answer);
                break;
        }
    }

    //****************************ANSWER*************************************
    public void an(double x) {

        if (number1 % 1 == 0) {
            int n1 = (int) number1;
            System.out.print("\t\t\t" + n1 + " " + Calc.oper + " ");
        } else
            System.out.print("\t\t\t" + number1 + " " + Calc.oper + " ");

        if (number2 % 1 == 0) {
            int n2 = (int) number2;
            System.out.print(n2 + " =");
        } else
            System.out.print(number2 + " =");

        if (x % 1 != 0) {
            System.out.println(" " + x);
        } else {
            answerInt = (int) x;
            System.out.println(" " + answerInt);
        }
    }
//**********************************************************************
}


