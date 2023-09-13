package Loops;

import java.util.Scanner;

public class A014ArmstrongCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        String numString = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            int n = Integer.parseInt(String.valueOf(numString.charAt(i)));
            sum += (int) Math.pow(n, numString.length());
        }
        System.out.println(sum);
        if (sum == number) {
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}
