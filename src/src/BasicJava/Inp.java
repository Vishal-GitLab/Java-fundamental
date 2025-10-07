package BasicJava;

import java.util.Scanner;        // Scanner is public use any where

public class Inp {
    public static void main(String[] args) {
        System.out.println("Hey how are you");       // System-->> somthing creat a java  and system is claas in java ,,   out --> out is commond line in java ,,,, out.println -->> out is null
         Scanner input = new Scanner(System.in);     // Scanner -->> Scanner will be  take input able to from  us    ,, Syestm.in-->> the standard input stream, keyboard
          System.out.println(input.nextInt());          //  input integer
        System.out.println(input.next());           // input String

    }
}
