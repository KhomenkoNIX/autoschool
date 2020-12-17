package module2.casting_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*В переменных q и w хранятся два натуральных числа. Создайте программу,
 выводящую на экран результат деления q на w с остатком.
 Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке*/

public class Casting1 {
    int q,w;
    public static void main(String[] args) throws IOException {
        Casting1 cast = new Casting1();
        cast.enterNumbers();
        cast.divideNumbers();

    }
     public void enterNumbers() throws IOException {
        System.out.println("Enter natural number q:");
        BufferedReader readerQ = new BufferedReader((new InputStreamReader(System.in)));
         q = readerQ.read();
        System.out.println("Enter natural number w:");
         BufferedReader readerW = new BufferedReader((new InputStreamReader(System.in)));
         w = readerW.read();
    }
    public void divideNumbers(){
        System.out.println(q);
        System.out.println(w);

        if(w != 0) {
           int divisionInteger = q / w;
           int divisionReminder = q % w;
           System.out.println("q/w =  and  in reminder"+ divisionInteger+" "+ divisionReminder);
       }
       else {
           System.out.println("division to 0 is not possible, try to enter denominator \"w\" not equal 0");
       }
    }
}
