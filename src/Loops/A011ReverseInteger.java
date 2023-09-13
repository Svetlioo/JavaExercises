package Loops;

import java.util.Scanner;

public class A011ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(reverseInteger(n));
        System.out.println(reverseIntegerString(n));
    }

    public static int reverseInteger(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static int reverseIntegerString(int n) {
        String numStr = Integer.toString(n);
        int length = numStr.length();

        char[] reversedChars = new char[length];


        for (int i = 0; i < length; i++) {
            reversedChars[i] = numStr.charAt(length - 1 - i);
        }

        String reversedStr = new String(reversedChars);
        return Integer.parseInt(reversedStr);
    }
}
