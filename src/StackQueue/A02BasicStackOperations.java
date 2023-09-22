package StackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class A02BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = nums[0];
        int s = nums[1];
        int x = nums[2];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] arr = sc.nextLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            stack.push(Integer.valueOf(arr[i]));
        }
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
            return;
        }
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num == x) {
                System.out.println(true);
                return;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println(smallest);
    }
}
