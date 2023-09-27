package Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class A08FilltheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);

        int[][] matrix = new int[n][n];
        int currentNum = 1;
        while (currentNum < n * n) {
            if (input[1].equals("A")) {
                for (int col = 0; col < n; col++) {
                    for (int row = 0; row < n; row++) {
                        matrix[row][col] = currentNum;
                        currentNum++;
                    }
                }
            }
            if (input[1].equals("B")) {
                for (int col = 0; col < n; col++) {
                    if (col % 2 == 0) {
                        for (int row = 0; row < n; row++) {
                            matrix[row][col] = currentNum;
                            currentNum++;
                        }
                    } else {
                        for (int row = n - 1; row >= 0; row--) {
                            matrix[row][col] = currentNum;
                            currentNum++;
                        }
                    }
                }
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }
    }
}
