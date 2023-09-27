package StackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class A011BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        int smallest = Integer.MAX_VALUE;
        int[] inputNums = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.offer(inputNums[i]);
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        while (!queue.isEmpty()) {
            if (queue.peek() == x) {
                System.out.println(true);
                return;
            }
            if (queue.peek() < smallest) {
                smallest = queue.peek();
            }
            queue.poll();
        }
        if (smallest != Integer.MAX_VALUE) {
            System.out.println(smallest);
        } else {
            System.out.println(0);
        }
    }
}
