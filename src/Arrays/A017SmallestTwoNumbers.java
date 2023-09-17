package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A017SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // 30, 15, 50, 5
            if (arr[i] < smallest) {
                int temp = smallest;
                smallest = arr[i];
                secondSmallest = temp;
            }
        }
        System.out.printf("Smallest: %d%nSecond smallest: %d%n", smallest, secondSmallest);
    }
}
