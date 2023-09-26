package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A08BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            String curr = Character.toString(input.charAt(i));
            switch (curr) {
                case "{", "[", "(" -> stack.push(curr);
                case "}" -> {
                    if (!stack.pop().equals("{")) {
                        System.out.println(false);
                        return;
                    }
                }
                case "]" -> {
                    if (!stack.pop().equals("[")) {
                        System.out.println(false);
                        return;
                    }
                }
                case ")" -> {
                    if (!stack.pop().equals("(")) {
                        System.out.println(false);
                        return;
                    }
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
