package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A06MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (Character.toString(input.charAt(i)).equals("(")) {
                stack.push(i);
            }
            if (Character.toString(input.charAt(i)).equals(")")) {
                for (int j = stack.peek(); j <= i; j++) {
                    System.out.print(input.charAt(j));
                }
                System.out.println();
                stack.pop();
            }
        }

    }
}
