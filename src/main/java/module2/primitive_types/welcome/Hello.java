package module2.primitive_types.welcome;

public class Hello {
    private static String  name;
    public static void setupName(String s){
        name = s;
    }
    public static void welcome(){
            String s= "Hello, %name%";
        System.out.println(s);
    }
    public static void byeBay(){
        String s= "Bye, %name%";
        System.out.println(s);
    }
}
