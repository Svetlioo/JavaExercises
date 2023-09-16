package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A020Longestsequenceofidenticalelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int longest = 0;
        int current = 0;
        int lastIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                current++;
            } else {
                if (current >= longest) {
                    longest = current;
                    lastIndex = i;
                    current = 0;
                }
            }
        }
        System.out.printf("last index: %d%nlongest: %d%n", lastIndex, longest);
        for (int i = lastIndex - longest; i <= lastIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
