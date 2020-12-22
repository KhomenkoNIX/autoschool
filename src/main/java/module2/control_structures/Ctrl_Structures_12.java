package module2.control_structures;

/*Вывести на экран таблицу умножения 10х10 используя цикл while.*/

public class Ctrl_Structures_12 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
