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
    static int[] list = new int[10];

    public static void main(String[] args) throws IOException {

        createArray();
        int[] reversedArray = createReversedIntArray(list);
        showArray(reversedArray);
    }

    public static void createArray() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < list.length; i++) {

            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
    }

    public static int[] createReversedIntArray(int[] arr) {

        if (arr.length > 0) {
            int[] array = new int[arr.length];
            int counter = list.length - 1;

            for (int i = 0; i < list.length; i++) {

                array[counter] = arr[i];
                System.out.println(array[counter]);
                counter--;
            }
            return array;
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
