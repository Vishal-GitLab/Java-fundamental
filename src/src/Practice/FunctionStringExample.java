package Practice;

import java.util.Scanner;

public class FunctionStringExample {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);
        String name = input.next();
        String personalised = myGreet(name);
        System.out.println(personalised);

    }
    static String myGreet(String name ) {
        String massage = "Hello " + name;
        return massage;
    }
}
