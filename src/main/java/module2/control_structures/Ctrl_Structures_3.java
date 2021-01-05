package module2.control_structures;
/*Ввести с клавиатуры три числа, и вывести их в порядке убывания.*/

import java.io.IOException;

public class Ctrl_Structures_3 {
    public static void main(String[] args) throws IOException {
        //input 3 numbers
        int[] arr = UsefulMethods.readNumbersInArray(3);
        //sort
        Ctrl_Structures_2.selectMaxSort(arr);
        //reversed print
        printReversedArray(arr);

    }

    public static void printReversedArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
