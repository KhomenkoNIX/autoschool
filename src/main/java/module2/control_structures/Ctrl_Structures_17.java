package module2.control_structures;

import java.io.IOException;

/*Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
…
*/
public class Ctrl_Structures_17 {
    public static void main(String[] args) throws IOException {
        //enter the name
        String s = Ctrl_Structures_4.readName();

        //show the lines
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s loves me%n", s);
        }
    }
}
