package Matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A09RowSumandColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = arr[0];
        int cols = arr[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = sc.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        ArrayList<Integer> rowSums = new ArrayList<>();
        ArrayList<Integer> colSums = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            int sum = 0;
            for (int col = 0; col < cols; col++) {
                sum += matrix[row][col];
            }
            rowSums.add(sum);
        }

        for (int col = 0; col < cols; col++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += matrix[row][col];
            }
            colSums.add(sum);
        }

        System.out.println("Row Sums:" + rowSums);
        System.out.println("Col Sums:" + colSums);


    }
}
