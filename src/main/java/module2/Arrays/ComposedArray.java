package module2.Arrays;
/*Один большой массив и два маленьких

1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComposedArray {
    static int[] bigArray = new int[20];
    static int[] firstArray = new int[10];
    static int[] secondArray = new int[10];

    public static void main(String[] args) throws IOException {
        initializeBigArray();
        initializeSmallArrays();
        showIntArray(secondArray);
    }

    public static void initializeBigArray() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < bigArray.length; i++) {

            String s = reader.readLine();
            bigArray[i] = Integer.parseInt(s);
        }

    }

    public static void initializeSmallArrays() {
        //from the first half of big array
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = bigArray[i];
        }
        //from the second half of big array
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = bigArray[i+10];
        }
    }
    public static void showIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
