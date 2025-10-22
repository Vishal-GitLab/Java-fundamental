package Switch;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();

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

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruit");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }





        int day  = input.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//
//
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
        //}


        switch (day) {
            case 1, 2, 3, 4, 5-> System.out.println("Weekday");

            case 7,8 -> System.out.println("Weekend");

       }
















    }
}
