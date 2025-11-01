package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // syntax
          ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(554);
//        list.add(294);
//
//        System.out.println(list.contains(654));                 // using the .contains --> true and false
//        System.out.println(list);
//        list.set(0 , 99);                 // using the .set() -->>.  update the  value
//
//        list.remove(2);
//        System.out.println(list);
//

        // input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index  here, list[index] syntax will not work here
        }

        //  System.out.println(list);































    }
}
