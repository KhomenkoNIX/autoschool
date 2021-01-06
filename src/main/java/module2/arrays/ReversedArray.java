package module2.arrays;
/*Массив из строчек в обратном порядке

1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedArray {

    public static void main(String[] args) throws IOException {

        String[] list = createAndPopulateStringArray(10, 8);
        printReversedArray(list);
    }

    public static String[] createAndPopulateStringArray(int size, int populate) throws IOException {
        String[] list = new String[size];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Enter %d strings: ", populate);

        for (int i = 0; i < populate; i++) {
            String s = reader.readLine();
            list[i] = s;
        }
        return list;
    }

    public static void printReversedArray(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
