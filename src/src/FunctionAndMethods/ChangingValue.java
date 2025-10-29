package FunctionAndMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangingValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {2,4,6,8,9};
        change(arr);
        System.out.println(Arrays.toString(arr));        // using Array.toString(arr) print the string
    }
    static void change(int[] nums){
        nums[0] = 99;             // if you make a change to the objects via this variable, same object will be changed
    }
}
