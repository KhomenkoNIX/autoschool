package module2.casting_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 /*В переменной n хранится вещественное число с ненулевой дробной частью.
   Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.*/

public class CastingRound {

    public static void main(String[] args) throws IOException {
        CastingRound cast = new CastingRound();
        //double d = cast.enterNumbers();
        System.out.println( (int) (-23.2 + 0.5));
        //System.out.printf("round number is %d ", cast.roundNumber(d));

    }

    public double enterNumbers() throws IOException {
        System.out.println("Enter float number n:");
        BufferedReader readerN = new BufferedReader((new InputStreamReader(System.in)));
        String inputNumber = readerN.readLine();
        return Double.parseDouble(inputNumber);
    }

    public long roundNumber(double d) {
        long number = (long) d;
        int defineRound =  (int)((d - (double) number) * 10);
        return 5 <= defineRound ? number+1 : number;
    }
}
