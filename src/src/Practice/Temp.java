package Practice;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your temp in");
        float temp  = input.nextFloat();

        float tempC = (temp * 9/5) + 32;
        System.out.println(tempC);
    }
}
