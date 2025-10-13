package Conditional;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  System.out.print("Please enter a number: ");

        /*
        Syntax of the loops
        for (initialisation; condition; increment /  decrement ) {
        // body
         */

        // Q : print numbers from 1 to 5

//        for (int num  = 1; num <= 5; num += 1 ) {
//            System.out.println(num);
//


//        int n = input.nextInt();
//        for (int num = 1; num <= n; num++) {
//         //   System.out.println(num + " ");
//
//            System.out.println("Hello World");
//        }
//


        // while loops
        /*
        syntax :
        while (condition) {
        // Body
         */

        //        for (int num  = 1; num <= 5; num += 1 ) {
       //            System.out.println(num);
       //          }

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }
//

        // do while
        /*

        do {
              // body
        } while (condition);
         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

    }
    }

