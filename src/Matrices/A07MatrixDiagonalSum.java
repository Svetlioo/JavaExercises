package Matrices;

import java.util.Scanner;

public class A07MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        int sum = 0;
        for (int row = 0; row < n; row++) {
            String[] inputTokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
            sum += matrix[i][i];
        }
        System.out.println();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(matrix[i][n - 1 - i] + " ");
            sum += matrix[i][n - 1 - i];
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
