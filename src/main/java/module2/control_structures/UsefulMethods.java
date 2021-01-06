package module2.control_structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class UsefulMethods {
    //after refactoring this two methods here in class -it affected code in 13 places, so I don't add here other methods,
    //and yes - refactoring could be a real pain!
    public static int[] readNumbersInArray(int size) throws IOException {
        int[] numbers = new int[size];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Enter %d numbers: ", size);
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(reader.readLine());
        }
        return numbers;
    }

    public static int readNumber() throws IOException {
        System.out.println("Enter a number: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}
