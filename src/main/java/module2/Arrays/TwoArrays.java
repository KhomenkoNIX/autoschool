package module2.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*2 массива

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.*/
public class TwoArrays {
    public static void main(String[] args) throws IOException {

        String[] list = createStringArray();
        int [] intLengthArray =new int [10];
        intLengthArray = initializeIntArray(list, intLengthArray);
        showIntArray(intLengthArray);
    }

    public static String[] createStringArray() throws IOException {
        String [] arr =new String [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = reader.readLine();
        }
        return arr;
    }
    public static int[] initializeIntArray(String[]strArr, int[]intArr)  {

        if(intArr.length== strArr.length)
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = strArr[i].length();
        }
        return intArr;
    }
    public static void showIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
