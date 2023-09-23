package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A04SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int currentNum = 0;
        int operator = 1;

        for (char c : nums.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '+') {
                stack.push(operator * currentNum);
                currentNum = 0;
                operator = 1;
            } else if (c == '-') {
                stack.push(operator * currentNum);
                currentNum = 0;
                operator = -1;
            }
        }
        stack.push(operator * currentNum);

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);
    }
}
