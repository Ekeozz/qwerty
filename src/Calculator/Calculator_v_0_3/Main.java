package Calculator.Calculator_v_0_3;

/**
 * Created by Evg on 19.07.2015. ${PACKAGE_NAME}
 */
public class Main {

    public static void main(String[] args) {

        Calc start = new Calc();  // Создаём объект класса Start
        Methods methods = new Methods();
        methods.head();                     // Рисуем заголовок
        start.start();              // Указываем тип операциии и вводим числа
        start.stop();
    }
}
