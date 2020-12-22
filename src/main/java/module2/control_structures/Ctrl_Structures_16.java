package module2.control_structures;
/* Используя цикл for вывести на экран:

- горизонтальную линию из 10 восьмёрок

- вертикальную линию из 10 восьмёрок.*/

public class Ctrl_Structures_16 {

    public static void main(String[] args) {
        //horizontal line
        for(int i =0;i<10;i++)
            System.out.print(8);

        System.out.println();
        //vertical line
        for(int i =0;i<10;i++)
            System.out.println(8);
    }


}
