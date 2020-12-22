package module2.reference_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Найти в строке указанную подстроку и заменить ее на новую.
 Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/
public class StringSubstitution {
    private static String s = "";
    private static String subString = "";
    private static String substitutionString = "";


    public static void main(String[] args) throws IOException {
        readString();
        readSubString();
        readSubstitutionString();

        substitution();

    }

    public static void readString() throws IOException {
        System.out.println("enter string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
    }

    public static void readSubString() throws IOException {
        System.out.println("enter the sub string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        subString = reader.readLine();

    }

    public static void readSubstitutionString() throws IOException {
        System.out.println("enter the substitution string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        substitutionString = reader.readLine();

    }

    public static void substitution() {
        s = s.replaceAll(subString, substitutionString);
        System.out.println(s);
    }


}
