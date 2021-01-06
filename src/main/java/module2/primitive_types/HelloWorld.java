package module2.primitive_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
        Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя,
        считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”.*/

public class HelloWorld {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");
        printHelloName();
    }

    static void printHelloName() throws IOException {
        System.out.print("Enter your name: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Hello, " + name);
    }
}
