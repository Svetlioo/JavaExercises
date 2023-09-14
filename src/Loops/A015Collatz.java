package Loops;

import java.util.Scanner;

public class A015Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.print(number + " ");
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = (number * 3) + 1;
            }
            System.out.print(number + " ");
        }
    }
}
