package Loops;

import java.util.Scanner;

public class A039ArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int row = n; row > 1; row--) {
            for (int i = row; i > 1; i--) {
                System.out.print(" ");
            }
            for (int i = row; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = n; row > 1; row--) {
            for (int i = 0; i < n / 2; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
