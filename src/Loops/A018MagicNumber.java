package Loops;

import java.util.Scanner;

public class A018MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second, third;
        do {
            first = Integer.parseInt(sc.nextLine());
            second = Integer.parseInt(sc.nextLine());
            third = Integer.parseInt(sc.nextLine());
        } while (first < 1 || first > 999 || second < first || second > 1000 || third < 1 || third > 10000);
        int combinations = 0;

        for (int i = first; i <= second; i++) {
            for (int j = first; j <= second; j++) {
                combinations++;
                if (i + j == third) {
                    System.out.printf("Combination %d - (%d + %d = %d)%n", combinations, i, j, i + j);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combinations, third);

    }

}
