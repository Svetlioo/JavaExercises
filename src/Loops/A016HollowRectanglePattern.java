package Loops;

import java.util.Scanner;

public class A016HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columns = Integer.parseInt(sc.nextLine());
        int rows = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < columns; i++) {
            if (i == 0 || i == columns - 1) {
                for (int j = 0; j < rows; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else {
                for (int k = 0; k < rows; k++) {
                    if (k == 0 || k == rows - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
