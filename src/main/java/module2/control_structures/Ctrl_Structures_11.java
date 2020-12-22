package module2.control_structures;

/*Вывести на экран квадрат из 10х10 букв S используя цикл while.*/

public class Ctrl_Structures_11 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(" S ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
