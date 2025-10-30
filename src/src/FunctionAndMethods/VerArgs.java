package FunctionAndMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VerArgs {
    public static void main(String[] args) {
     //   fun();
      //  multiple(2,4,"Vishal","Rahul");

       // demo("Vishal" , "Kunal");
       // demo(4,5);
        //demo();
    }
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
