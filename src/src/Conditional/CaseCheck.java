package Conditional;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       char ch = input.next().trim().charAt(0);       // .trim()   remove all the extra spaces that are at the and these word

//        String word = "hello";
//        System.out.println(word.charAt(2));

      // System.out.println(input.next().trim());


        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else {
            System.out.println("Upper case");
        }
    }
}
