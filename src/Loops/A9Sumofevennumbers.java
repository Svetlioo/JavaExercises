package Loops;

import java.util.Scanner;

public class A9Sumofevennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n * 2; i += 2) {
            sum += i + 2;
        }
//        for (int i = 1; i <= n; i++) {
//            sum += i * 2;
//        }
        System.out.println(sum);
    }
}
