package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A015LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            //  [1,0,0,0,0,0];
            for (int j = i; j >= i - k && j >= 0; j--) {
                sum += arr[j];
            }
            arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
