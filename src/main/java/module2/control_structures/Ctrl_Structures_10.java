package module2.control_structures;
/*Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз, используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ctrl_Structures_10 {

    public static void main(String[] args) throws IOException {

        int number = 0;
        String line = "";

        number = Ctrl_Structures_1.readNumber();
        line = readString();

        while (number > 0) {
            number--;
            System.out.println(line);
        }

    }

    public static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string: ");
        return reader.readLine();
    }
}
