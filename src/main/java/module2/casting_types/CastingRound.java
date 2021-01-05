package module2.casting_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 /*В переменной n хранится вещественное число с ненулевой дробной частью.
   Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.*/

public class CastingRound {

    public static void main(String[] args) throws IOException {
        CastingRound cast = new CastingRound();

        double d = cast.enterNumbers();

        System.out.printf("round number is %d ", cast.roundNumber(d));

    }

    public double enterNumbers() throws IOException {
        System.out.println("Enter float number n:");
        BufferedReader readerN = new BufferedReader((new InputStreamReader(System.in)));
        String inputNumber = readerN.readLine();
        return Double.parseDouble(inputNumber);

    }

    public long roundNumber(double d) {
        long roundNumber;
        String inputNumber=Double.toString(d);
        String temp = inputNumber.substring(0, inputNumber.indexOf('.'));

        if (5 <= Character.getNumericValue(inputNumber.charAt(inputNumber.indexOf('.') + 1))) {
            roundNumber = Long.parseLong(temp) + 1;
        } else {
            roundNumber = Long.parseLong(temp);
        }
        return roundNumber;
    }

}
