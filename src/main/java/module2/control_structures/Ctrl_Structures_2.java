package module2.control_structures;

import java.io.IOException;

/* 2 Ввести с клавиатуры четыре числа, и вывести максимальное из них.*/
public class Ctrl_Structures_2 {

    public static void main(String[] args) throws IOException {

        int[] array = UsefulMethods.readNumbersInArray(4);
        //print max value
        System.out.println(selectMaxSort(array));
    }

    //Selection sort method
    public static int selectMaxSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array[array.length - 1];
    }
}
