package Practice;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = input.nextInt();
        System.out.print("Enter a second number: ");
        int b = input.nextInt();
        System.out.print("Enter a third number: ");
        int c = input.nextInt();




        int max = Math.max(c , (Math.max(a,b)));
        System.out.println(max);
    }
}
