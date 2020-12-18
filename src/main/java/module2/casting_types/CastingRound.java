package module2.casting_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 /*В переменной n хранится вещественное число с ненулевой дробной частью.
   Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.*/

public class CastingRound {
    private double n;

    public static void main(String[] args) throws IOException {
        CastingRound cast = new CastingRound();
        cast.enterNumbers();
        cast.roundNumber();

    }

    public void enterNumbers() throws IOException {
        System.out.println("Enter float number n:");
        BufferedReader readerN = new BufferedReader((new InputStreamReader(System.in)));
        String strN = readerN.readLine();
        n = Double.parseDouble(strN);

    }

    public void roundNumber() {
        long roundNumber;
        roundNumber = Math.round(n);
        System.out.printf("round number n: %f is %d ", n, roundNumber);
    }
}
