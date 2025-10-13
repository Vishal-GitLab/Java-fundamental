package Conditional;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a first number: ");
        int a = input.nextInt();
        System.out.print("Please enter a second number: ");
        int b = input.nextInt();
        System.out.print("Please enter a third number: ");
        int c = input.nextInt();

        // Q: Find the largest of the 3 numbers
//
//        int max = a;
//        if (b > max ) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println("Your maximum number is " + max);


        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
