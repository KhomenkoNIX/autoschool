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
        String[] list = new String[10];
        createArray(list);
        printReversedArray(list);
    }

    public static void createArray(String[] list) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 8 strings:");
        for (int i = 0; i < 8; i++) {

            String s = reader.readLine();
            list[i] = s;
        }
    }

    public static void printReversedArray(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
