package Practice;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        byte b = 32;
        int i = 76;
         char c = 'a';
         double d = 987.76;
         float f = 34.3f;
         short s = 1024;

         double result = (f*b)  +  (i/c) - (d*c);
        System.out.println( (f*b) + "" + "" + (i/c) + "" + (d*c));
        System.out.println(result);


    }
}
