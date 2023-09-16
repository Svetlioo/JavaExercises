package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A09PrinteveryNthElementfromanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\s*,\\s*");

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < arr.length; i += n) {
            System.out.print(arr[i] + " ");
        }
    }
}
