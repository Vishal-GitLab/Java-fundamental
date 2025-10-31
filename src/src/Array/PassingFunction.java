package Array;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        // String are immutably in java and Array is mutably in java(You can change the object)

        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
