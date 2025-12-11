package Practice;

public class FunctionShadowing {
  static   int x = 45;          // this will be  shadowed at line 
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x = 67;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
