package Calculator.Calculator_v_0_2;
/**
 * Created by Evg on 19.07.2015.
 */
public class Operation {
    public double answer;

    public void slozenie() {
        answer = Start.number1 + Start.number2;
        answer();
    }

    public void vichetanie() {
        answer = Start.number1 - Start.number2;
        answer();
    }

    public void umnozhenie() {
        answer = Start.number1 * Start.number2;
        answer();
    }

    public void delenie() {
        answer = Start.number1 / Start.number2;
        answer();
    }

    public void answer() {
        if (answer % 1 != 0)
            System.out.println("       Ответ:    " + answer);
        else {
            int a = (int) answer;
            System.out.println("       Ответ:    " + a);
        }
    }

    public void op() {
        if (Start.oper.equals("*"))
            this.umnozhenie();
        else if (Start.oper.equals("/"))
            this.delenie();
        else if (Start.oper.equals("+"))
            this.slozenie();
        else
            this.vichetanie();
    }

}
