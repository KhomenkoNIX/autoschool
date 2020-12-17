package module2.primitive_types;

import module2.primitive_types.welcome.Hello;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

 public class Main2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, world!");
        //Additional task
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
         Hello.setupName(reader.readLine());

    }

}
