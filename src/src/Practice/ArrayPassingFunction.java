package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPassingFunction {
    public static void main(String[] args) {
        int[] nums = {1,23 , 45, 76};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
