package Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class A01CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows1 = arr1[0];
        int cols1 = arr1[1];
        int[][] matrix1 = new int[rows1][cols1];
        for (int row = 0; row < rows1; row++) {
            String[] inputTokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < cols1; col++) {
                matrix1[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        int[] arr2 = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows2 = arr2[0];
        int cols2 = arr2[1];
        int[][] matrix2 = new int[rows2][cols2];
        for (int row = 0; row < rows2; row++) {
            String[] inputTokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < cols2; col++) {
                matrix2[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        if (matrix1.length!= matrix2.length) {
            System.out.println(false);
            return;
        }
        for (int row = 0; row < rows1; row++) {
            for (int col = 0; col < cols1; col++) {
                if (matrix1[row][col]!= matrix2[row][col]) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);


    }
}






