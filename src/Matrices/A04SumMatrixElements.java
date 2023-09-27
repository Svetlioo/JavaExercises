package Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class A04SumMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = arr[0];
        int cols = arr[1];
        int sum = 0;
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
                sum += matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);


    }
}
