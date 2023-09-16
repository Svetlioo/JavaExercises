package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A04ReverseanArrayofStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split("\\s*,\\s*");

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
