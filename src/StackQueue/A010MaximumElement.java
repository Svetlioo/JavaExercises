package StackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class A010MaximumElement {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int numCommands = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numCommands; i++) {
            String[] input = sc.nextLine().split("\\s+");
            if (input.length == 2) {
                stack.add(input[1]);
            }
            if (input.length == 1) {
                if (Integer.parseInt(input[0]) == 2) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
                if (Integer.parseInt(input[0]) == 3) {
                    int maximum = Integer.MIN_VALUE;
                    int[] arr = stack.stream().mapToInt(Integer::parseInt).toArray();
                    for (int curr : arr) {
                        if (curr > maximum) {
                            maximum = curr;
                        }
                    }

                    queue.offer(maximum);
                }
            }
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
