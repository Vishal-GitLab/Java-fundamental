package FunctionAndMethods;

public class Shadowing {
    static int x = 90;  // this will be shadowed at line
    public static void main(String[] args) {
        System.out.println(x);
        int x;    // by class variable at line 4 is shadowed by this
       // System.out.println(x);    // scope will begin when value is initialised
        x = 40;
        System.out.println(x);     // 40
        fun();
    }
    static  void fun() {
        System.out.println(x);
    }
}
