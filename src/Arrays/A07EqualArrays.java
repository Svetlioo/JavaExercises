package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A07EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arr2 = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                return;
            }
            sum += arr[i];
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
