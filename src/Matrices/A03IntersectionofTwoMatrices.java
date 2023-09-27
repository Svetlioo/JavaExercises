package Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class A03IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());
        char[][] matrix1 = new char[rows][cols];
        char[][] matrix2 = new char[rows][cols];
        char[][] matrix3 = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] tokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix1[row][col] = tokens[col].charAt(0);
            }
        }


        for (int row = 0; row < rows; row++) {
            String[] tokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix2[row][col] = tokens[col].charAt(0);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix1[row][col] == matrix2[row][col]) {
                    matrix3[row][col] = matrix1[row][col];
                } else {
                    matrix3[row][col] = '*';
                }
                System.out.print(matrix3[row][col] + " ");
            }
            System.out.println();
        }


    }
}
