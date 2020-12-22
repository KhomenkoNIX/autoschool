package module2.control_structures;
/*За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу.
Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.

Для генерации секретного числа используете код:
Random random = new Random();
int secret;
// Генерируем число от 0 до 20
secret = random.nextInt(20 + 1);*/

import java.io.IOException;
import java.util.Random;

public class Ctrl_Structures_7 {

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int secret;
        int yourGuess;
        // Генерируем число от 0 до 20
        secret = random.nextInt(20 + 1);

        System.out.println("Try to guess a number 0 to 20. Only 7 attempts");
        guessNumber(secret);
    }

    public static void guessNumber(int secret) throws IOException {

        for (int i = 1; i <= 7; i++) {
            int n = Ctrl_Structures_1.readNumber();
            if (n == secret) {
                System.out.println("You are right!!!!");
                break;
            } else if (n < secret)
                System.out.println("Secret number is bigger");
            else {
                System.out.println("Secret number is less");
            }
            //when 7 attempts are lost
            if (i == 7)
                System.out.println("You haven't guessed the number!");
        }
    }

}
