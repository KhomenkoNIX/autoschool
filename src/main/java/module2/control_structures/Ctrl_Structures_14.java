package module2.control_structures;

/* Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4

8888

8888*/

import java.io.IOException;

public class Ctrl_Structures_14 {

    public static void main(String[] args) throws IOException {

        int m =UsefulMethods.readNumber();
        int n =UsefulMethods.readNumber();
        printRectangle(m, n);
    }

    public static void printRectangle(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }

}
