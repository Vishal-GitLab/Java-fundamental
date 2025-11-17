package Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String secondName = input.next();
        String add = firstName + secondName;
        System.out.println(" "  + add);
    }
}
