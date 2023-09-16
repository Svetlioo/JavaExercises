package Loops;

import java.util.Scanner;

public class A023Numbersupto1000endinginn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == n) {
                System.out.println(i);
            }
        }
    }
}
