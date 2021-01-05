package module2.primitive_types;

import module2.primitive_types.welcome.Hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Создать еще один класс Main2 с методом main(String[] args), который при запуске выводит в консоль “Hello, world!”.
Создать отдельный пакет ‘com.welcome’. В нем создать класс Hello, туда добавить методы:
setupName(String name) - присваивает внутренней private переменной имя человека,
welcome() - формирует и выводит в консоль приветствие "Hello, %name%" (имя должно подставляться), byeBay() - прощается с выводом в консоль фразы "Bye, %name%"
В Main2 классе подключить этот пакет, и вначале программы запросить имя человека, присвоить его переменной класса Hello, потом поприветствовать его, в конце
 - попрощаться перед закрытием программы. Между ‘hello’ и ‘bye’ будет ваше “Hello, world!”.*/
public class Main2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Input name:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name =reader.readLine();

        Hello hello = new Hello();
        hello.setupName(name);
        hello.welcome();
        System.out.println("Hello, world!");
        hello.byeBay();

    }

}
