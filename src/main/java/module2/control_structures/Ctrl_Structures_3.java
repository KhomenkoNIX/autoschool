package module2.control_structures;
/*Ввести с клавиатуры три числа, и вывести их в порядке убывания.*/

import java.io.IOException;

public class Ctrl_Structures_3 {
    public static void main(String[] args) throws IOException {
        //input 3 numbers
        int a = Ctrl_Structures_1.readNumber();
        int b = Ctrl_Structures_1.readNumber();
        int c = Ctrl_Structures_1.readNumber();
        //sort
        int[] arr = {a,b,c};
        Ctrl_Structures_2.selectionSort(arr);
        //reversed print
        printReversedArray(arr);

    }
    public static void printReversedArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
