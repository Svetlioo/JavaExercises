package Loops;

import java.util.Scanner;

public class A032Rhombusfromasterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


