package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A07PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String input;
        do {
            input = sc.nextLine();
            if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Standby");
                } else {
                    System.out.printf("Cancelled %s%n", queue.poll());
                }
            } else {
                if (!input.equals("print")) {
                    queue.offer(input);
                }
            }

        }
        while (!input.equals("print"));
        while (!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }
    }
}
