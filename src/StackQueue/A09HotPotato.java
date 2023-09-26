package StackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class A09HotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(sc.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>(Arrays.asList(arr));


        while (queue.size() > 1) {
            for (int i = 0; i < n - 1; i++) {
                String removedPlayer = queue.poll();
                queue.offer(removedPlayer);
            }
            String removedPlayer = queue.poll();
            System.out.println("Remove " + removedPlayer);
        }

        System.out.println("Last is " + queue.poll());
    }
}

