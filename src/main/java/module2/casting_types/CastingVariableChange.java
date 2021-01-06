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


        CastingVariableChange varChange = new CastingVariableChange();
        varChange.ChangeABC(a, b, c);
        System.out.println("Given: a = 2, b = 8, c = 15\nAfter:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }

    public void ChangeABC(int a, int b, int c) {
        this.a = a + b;
        this.b = c - a;
        this.c = a + b + c;
    }
}
