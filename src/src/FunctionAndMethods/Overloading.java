package FunctionAndMethods;

public class Overloading {
    public static void main(String[] args) {
                                               // compile time decide which function run
  //  fun(65);
 //  fun("Vishal");
     int ans = sum(3,4,78);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return  a + b;
    }

    static int sum(int a, int b, int c){
        return  a + b + c;
    }
    static void fun(int a) {                         // argument should be different ,, type of argument should different ,, number of argument is same
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name) {                   // two or more function have same name is called overloading
        System.out.println("Second one");
        System.out.println(name);
    }
}
