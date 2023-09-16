package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A03ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = Arrays.stream(sc.nextLine()
                        .split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - i - 1];
        }
        System.out.println(Arrays.toString(reversed));


    }
}
