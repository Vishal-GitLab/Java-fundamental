package BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // int[]  arr = {5,4,3,2,1};
        int[] arr = {-1,7,-32,0, 89};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 time
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at j=the last respective index
            for (int j = 1; j < arr.length- i; j++) {
                // swap if the item is smaller than the previous  item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped =  true;
                }
            }
            // if you did not swap for a particular value of i, it items the array is sorted hence stop the program
            if (!swapped) {      // (swapped == false)            // !false =  true;
                break;
            }
        }
    }
}
