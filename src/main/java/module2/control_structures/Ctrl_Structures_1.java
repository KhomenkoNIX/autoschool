package module2.control_structures;


// "I know it's not appropriate convention for naming classes, but in these 18 tasks - it's easier to read by numbers and separated with "_"

/*1 Ввести с клавиатуры два числа, и вывести на экран минимальное из них.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ctrl_Structures_1 {
    public static void main(String[] args) throws IOException {
        int[] ab = UsefulMethods.readNumbersInArray(2);
        printMinNumber(ab);
    }

    public static void printMinNumber(int[] arr) {
        if (arr[0] == arr[1])
            System.out.println("numbers are equal");
        else
            System.out.println("min number is: " + (arr[0] < arr[1] ? arr[0] : arr[1]));
    }
}
