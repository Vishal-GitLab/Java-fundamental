package BasicJava;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is: " + rollno);


        String name = input.next();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }

}
