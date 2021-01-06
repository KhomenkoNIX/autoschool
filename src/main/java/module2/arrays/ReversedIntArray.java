package module2.arrays;
/*Массив из чисел в обратном порядке

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedIntArray {

    public static void main(String[] args) throws IOException {

        int[] arr = createArray(10);
        int[] reversedArray = createReversedIntArray(arr);
        showArray(reversedArray);
    }

    public static int[] createArray(int size) throws IOException {
        int[] list = new int[size];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < list.length; i++) {

            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        return list;
    }

    public static int[] createReversedIntArray(int[] arr) {

        if (arr.length > 0) {
            int[] arrayReversed = new int[arr.length];
            int counter = arr.length - 1;

            for (int i = 0; i < arr.length; i++) {

                arrayReversed[counter] = arr[i];
                counter--;
            }
            return arrayReversed;
        } else {
            System.out.println("Not initialized array is passed and returned");
            return new int[0];
        }
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
