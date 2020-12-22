package module2.control_structures;

import java.io.IOException;

/*Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»*/
public class Ctrl_Structures_6 {
    public static void main(String[] args) throws IOException {

        int age = 0;
        String name = "";

        age = Ctrl_Structures_1.readNumber();
        name = Ctrl_Structures_4.readName();

        if (age > 20)
            System.out.println("И 18-ти достаточно»");
    }

}
