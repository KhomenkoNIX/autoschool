package module2.primitive_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");
        System.out.print("Enter your name: ");
        printHelloName();
    }
    static void printHelloName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Hello, " + name);
    }
}
