package Loops;

import java.util.Scanner;

public class A012FibonacciSum {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            sum += a;
            System.out.println(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.printf("%nSum: %d", sum);
    }

}
