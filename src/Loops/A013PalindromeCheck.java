package Loops;

import java.util.Scanner;

public class A013PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        char[] reversed = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            reversed[i] = word.charAt(word.length() - 1 - i);
        }
        System.out.println(new String(reversed));
        if (new String(reversed).equals(word)) {
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}
