package module2.arrays;
/*Максимальное среди массива на 20 чисел

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckMaxValue {

    public static void main(String[] args) throws IOException {
        int sizeArray = 5;
        showMaxValue(initializeArray(sizeArray));
    }

    public static int[] initializeArray(int sizeArray) throws IOException {
        int[] list = new int[sizeArray];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < list.length; i++) {

            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        return list;
    }

    public static void showMaxValue(int[] array) {
        //Bubble sorter
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = (array.length - 1); j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(array[(array.length - 1)]);
    }

}


