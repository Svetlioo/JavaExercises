package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A03Browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String initial = (sc.nextLine());
        stack.push(initial);
        System.out.println(initial);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("Home")) {
                return;
            }
            if (input.equals("back")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    System.out.println(stack.peek());
                }
                continue;
            }
            stack.push(input);
            System.out.println(input);


        }
    }
}
