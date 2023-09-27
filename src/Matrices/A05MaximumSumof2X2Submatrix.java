package Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class A05MaximumSumof2X2Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = arr[0];
        int cols = arr[1];
        int maxRow = 0;
        int maxCol = 0;
        int maxSum = 0;

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int currentSum = 0;
                currentSum += matrix[row][col] + matrix[row + 1][col] + matrix[row][col + 1] + matrix[row + 1][col + 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        System.out.println(maxSum);
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(matrix[maxRow + row][maxCol + col] + " ");
            }
            System.out.println();
        }


    }
}
