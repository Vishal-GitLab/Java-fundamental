package FunctionAndMethods;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b  = 30;


        swap(a,b);
        System.out.println(a + " " + b);
        String name = "Vishal Chaurasiya";
        changingName(name);
        System.out.println(name);

    }
    static void changingName(String name){
        name = "Ankit kumar";
        
    }



    static  void swap(int a, int b) {
        int temp = a;
        a =  b;
        b = temp;
    }
}
