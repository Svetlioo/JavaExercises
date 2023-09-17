package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A012ExtractaNonDecreasingSubsequencefromanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int biggest = 0;
        StringBuilder filtered = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                filtered.append(arr[i]).append(" ");
                biggest = arr[i];
            }
        }
        System.out.println(filtered);
    }
}
