package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A01ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] arr = sc.nextLine().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            stack.push(Integer.valueOf(arr[i]));
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
