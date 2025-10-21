package Switch;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

//        switch (fruit) {
//            case "Mango":
//                System.out.println("king of fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//
//            case "Grapes":
//                System.out.println("small fruit");
//
//            default:
//                System.out.println("Please enter a valid fruit");
//        }

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }


















    }
}
