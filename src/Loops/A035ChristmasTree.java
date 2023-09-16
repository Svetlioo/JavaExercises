package Loops;

import java.util.Scanner;

public class A035ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        System.out.print(" | ");
        System.out.println();
        for (int row = n; row >= 1; row--) {
            for (int i = row; i > 1; i--) {
                System.out.print(" ");
            }
            for (int i = row; i <= n; i++) {
                System.out.print("*");
            }
            System.out.print(" | ");


            for (int i = row; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
