package module2.control_structures;

/*Используя цикл for вывести на экран чётные числа от 1 до 100 включительно*/
public class Ctrl_Structures_13 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; ) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
