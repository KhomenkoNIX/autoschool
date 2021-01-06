package module2.control_structures;

/*Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»*/

import java.io.IOException;

public class Ctrl_Structures_5 {

    public static void main(String[] args) throws IOException {

        int age = UsefulMethods.readNumber();
        String name = Ctrl_Structures_4.readName();

        if (age < 18)
            System.out.println("Подрасти еще");
    }

}
