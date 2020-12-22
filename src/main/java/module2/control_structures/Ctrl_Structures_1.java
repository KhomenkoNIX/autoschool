package module2.control_structures;


// "I know it's not appropriate convention for naming classes, but in these 18 tasks - it's easier to read by numbers and separated with "_"

/*1 Ввести с клавиатуры два числа, и вывести на экран минимальное из них.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ctrl_Structures_1 {
    public static void main(String[] args) throws IOException {

        int a = readNumber();
        int b = readNumber();

        if (a == b) {
            System.out.println("a=b");
        } else if (a < b)
            System.out.println("a is min: " + a);
        else
            System.out.println("b is min: " + b);

    }

    public static int readNumber() throws IOException {
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        n = Integer.parseInt(reader.readLine());
        return n;
    }
}
