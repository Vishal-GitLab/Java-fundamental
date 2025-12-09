package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionChangingValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ChangingValue(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ChangingValue(int[] nums) {
         nums[3] =23;
    }
}
