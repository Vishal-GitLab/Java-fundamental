package Practice;

public class FunctionSwap {
    public static void main(String[] args) {
        int a =  670;
        int b = 43;


        swap(a,b);
        System.out.println(a  + " " + b);
         String name = "Ankit Kumar";
         ChangingName(name);
        System.out.println(name);
    }

    static void ChangingName(String name ) {
        name = "Vishal chaurasiya ";
    }

    static void swap(int num1, int num2) {
        int temp;
         temp = num1;
        num2 =  temp;
        temp =  num2;
    }
}
