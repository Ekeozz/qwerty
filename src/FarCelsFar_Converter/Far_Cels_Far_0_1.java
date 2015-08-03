package FarCelsFar_Converter;

import java.util.Scanner;

/**
 * Created by Evg on 01.08.2015. PACKAGE_NAME
 */
public class Far_Cels_Far_0_1 {

    public static void main(String[] args) {
        head();
        oper();

    }

    //Заголовок
    static void head() {
        System.out.println("**********************************************");
        System.out.println("*     Farenheit/Celsius converter v.0.1      *");
        System.out.println("**********************************************");
    }

    //Выбор операции
    static void oper() {
        System.out.println("    Для преобразования температуры укажите:");
        System.out.println("        из Фаренгейта в Цельсий --> f");
        System.out.println("        из Цельсия в Фаренгейт  --> c");
        System.out.print("  Какую операцию желаете совершить: ");
        Scanner sc = new Scanner(System.in);
        String oper = sc.nextLine();
        double convert;
        switch (oper) {
            case "f":
                System.out.print("Укажите температуру по Фаренгейту: ");
                convert = sc.nextDouble();
                System.out.println("...равно градусам по Цельсию: " + convertToCelsius(convert));
                break;
            case "F":
                System.out.print("Укажите температуру по Фаренгейту: ");
                convert = sc.nextDouble();
                System.out.println("...равно градусам по Цельсию: " + convertToCelsius(convert));
                break;
            case "c":
                System.out.print("Укажите температуру по Цельсию: ");
                convert = sc.nextDouble();
                System.out.println("...равно градусам по Фаренгейту: " + convertToFarenheit(convert));
                break;
            case "C":
                System.out.print("Укажите температуру по Цельсию: ");
                convert = sc.nextDouble();
                System.out.println("...равно градусам по Фаренгейту: " + convertToFarenheit(convert));
                break;
            default:
                System.err.print("Вы указали неверную букву...");
        }
//        if () {
//            return true;
//        } else
//            return false;
    }

    //Конвертация в градусы Цельсия
    static double convertToCelsius(double far) {
        return ((far - 32) * 5 / 9);
    }  // (far - 32) / 1.8000

    //Конвертация в градусы Фаренгейта
    static double convertToFarenheit(double cel) {
        return (cel * 1.8000 + 32);
    }

}
