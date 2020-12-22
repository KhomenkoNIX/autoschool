package module2.casting_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*В переменной n хранится натуральное двузначное число.
 Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/

public class CastingSum {
    private int n;

    public static void main(String[] args) throws IOException {

        int number = enterNumber();
        sumDigits(number);
    }
//test
    public static int enterNumber() throws IOException {
        System.out.println("Enter natural two-digit number n:");
        BufferedReader readerN = new BufferedReader((new InputStreamReader(System.in)));
        String strN = readerN.readLine();
        return Integer.parseInt(strN);
    }

    public static void sumDigits(int n) {
        if (n < 100 && n > 9) {
            int digitDec = n / 10;
            int digit = n % 10;
            int sum = digitDec + digit;
            System.out.printf("sum of :  %d + %d = %d", digitDec, digit, sum);
        }
    }

}

