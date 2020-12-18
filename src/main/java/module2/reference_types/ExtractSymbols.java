package module2.reference_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/*Дана строка. Вывести первый, последний и средний (если он есть) символы. Напишите программу,
которая выводит часть строки до первой встреченной точки, включая точку.
Также предусмотрите вывод количества пробелов.*/
public class ExtractSymbols {
    private static String s ="";
    public static void main(String[] args) throws IOException {

        readString();
        printCharacters(s);

    }
    public static void readString() throws IOException {
        System.out.println("enter string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        System.out.println("Length of the string is: "+s.length());
    }
    public static void printCharacters(String s){

        if(s.length()!=0){
            System.out.println("First char is: "+s.substring(0,1));
            System.out.println("Last char is: "+s.substring(s.length()-1));

            if(0 != s.length() % 2){
                int middleChar=(s.length()/2)+1;
                System.out.println("Middle char is: "+s.substring(middleChar-1,(middleChar)));
            }
            else{
                System.out.println("Last char doesn't exist");
            }
        }

    }

}
