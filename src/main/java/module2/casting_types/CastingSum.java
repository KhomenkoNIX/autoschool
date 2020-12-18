package module2.casting_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*В переменной n хранится натуральное двузначное число.
 Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/

public class CastingSum {
    private int n;

    public static void main(String[] args) throws IOException {
        CastingSum cast = new CastingSum();
        cast.enterNumbers();
        cast.sumNumbers();

    }

    public void enterNumbers() throws IOException {
        System.out.println("Enter natural number n:");
        BufferedReader readerN = new BufferedReader((new InputStreamReader(System.in)));
        String strN = readerN.readLine();
        n = Integer.parseInt(strN);

    }

    public void sumNumbers() {
        int sum = n + n;
        System.out.printf("n+n:  %d + %d = %d", n, n, sum);
    }

}

