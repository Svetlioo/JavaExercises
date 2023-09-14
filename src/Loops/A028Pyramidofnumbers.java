package Loops;

import java.util.Scanner;

public class A028Pyramidofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastNumber = scanner.nextInt();

        int currentNumber = 1;
        for (int row = 1; currentNumber <= lastNumber; row++) {
            for (int i = 1; i <= row && currentNumber <= lastNumber; i++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }
}
