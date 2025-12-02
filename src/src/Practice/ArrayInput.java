package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int[] arr = new int[5];
            arr[0]=23;
            arr[1]=33;
            arr[2]=43;
            arr[3]=53;
            arr[1]=63;



            String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));


        str[1] = "Ankit";

        System.out.println(Arrays.toString(str));
    }
}