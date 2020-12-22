package module2.control_structures;

/*Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
public class Ctrl_Structures_15 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(8 + " ");
            }
            System.out.println();
        }
    }
}
