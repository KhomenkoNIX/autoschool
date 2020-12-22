package module2.control_structures;

import java.io.IOException;

/* 2 Ввести с клавиатуры четыре числа, и вывести максимальное из них.*/
public class Ctrl_Structures_2 {
    static int a, b, c, d;

    public static void main(String[] args) throws IOException {
        a = Ctrl_Structures_1.readNumber();
        b = Ctrl_Structures_1.readNumber();
        c = Ctrl_Structures_1.readNumber();
        d = Ctrl_Structures_1.readNumber();
        int[] array = new int[] {a, b, c, d};
        selectionSort(array);
        //print max value
        System.out.println(array[3]);
    }

    //Selection sort method
    public static void selectionSort(int[] array) {
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
    }
}
