package Loops;

import java.util.Scanner;

public class A036Sunglasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < 2 * n - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            if (i == ((n - 1) / 2 - 1)) {
                for (int j = 0; j < n; j++) {
                    System.out.print("|");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for (int j = 0; j < 2 * n - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        System.out.println();


    }

}
