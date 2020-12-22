package module2.reference_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

/*Вводится строка слов, разделенных пробелами.
Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько,
не обрабатывать.*/

public class SplitParseString {
    private static String s;
    public static void main(String[] args) throws IOException {
        s = readString();
        printBiggestWord(s);
    }
    public static String readString() throws IOException {
        System.out.println("enter string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static void printBiggestWord(String s){
       //Bubble sorting
        String[] array = s.split(" ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = (array.length - 1); j > i; j--) {
                if (array[j - 1].length() > array[j].length()) {
                    String temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[(array.length-1)]);
    }
}
