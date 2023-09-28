package Loops;

import java.util.Scanner;

public class A047SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String number = Integer.toString(i);
            boolean isSpecial = true;
            for (int j = 0; j < number.length(); j++) {
                int num = Integer.parseInt(String.valueOf(number.charAt(j)));
                if (num == 0 || n % num != 0) {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.println(i);
            }
        }
    }
}
