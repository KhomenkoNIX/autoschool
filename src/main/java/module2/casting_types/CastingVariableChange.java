package module2.casting_types;

/*Даны три переменные a, b и c.
Изменить значения этих переменных так, чтобы
в a хранилось значение a+b,
в b хранилась разность старых значений c−a,
в c хранилось сумма старых значений a+b+c.
Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7*/
public class CastingVariableChange {
    private static int a = 2;
    private static int b = 8;
    private static int c = 15;

    public static void main(String[] args) {

        int temporaryA = changeA(a, b);
        int temporaryB = changeB(a, c);
        int temporaryC = changeC(a, b, c);
        a = temporaryA;
        b = temporaryB;
        c = temporaryC;
        System.out.println("Given: a = 2, b = 8, c = 15\nAfter:");
        System.out.println("a = a+b = " + a);
        System.out.println("b = c+a = " + b);
        System.out.println("c = a+b+c = " + c);
    }

    public static int changeA(int a, int b) {
        a = a + b;
        return a;
    }

    public static int changeB(int a, int c) {
        a = c + a;
        return a;
    }

    public static int changeC(int a, int b, int c) {
        c = a + b + c;
        return c;
    }
}
