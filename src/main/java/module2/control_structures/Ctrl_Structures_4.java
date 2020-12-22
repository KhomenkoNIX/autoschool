package module2.control_structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
 Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».*/
public class Ctrl_Structures_4 {
    public static void main(String[] args) throws IOException {

        String firstName = readName();
        String secondName = readName();

        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Имена идентичны");
        } else if (firstName.length() == secondName.length())
            System.out.println("Длины имен равны");
        else
            System.out.println("Имена разные");

    }

    public static String readName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        return reader.readLine();
    }
}
