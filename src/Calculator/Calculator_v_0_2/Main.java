package Calculator.Calculator_v_0_2;

/**
 * Created by Evg on 19.07.2015.
 */
public class Main {

    public static void main(String[] args) {

        Head head = new Head();
        Start start = new Start();
        Operation operation = new Operation();
        head.head();    // Рисуем заголовок
        start.start();  // Указываем тип операциии и вводим числа
        //operation.op(); // Определяем тип операции и производим операцию
    }
}
