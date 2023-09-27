package Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class A02MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = arr[0];
        int cols = arr[1];
        int[][] matrix1 = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix1[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        int[][] matrix2 = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix2[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("%d ", matrix1[row][col] + matrix2[row][col]);
            }
            System.out.println();
        }


    }
}
