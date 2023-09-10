package ConditionalStatements;

import java.util.Scanner;

public class LeapYear18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        if (input % 4 != 0 ) {
            System.out.println("It‘s not a leap year.");
        } else if (input % 100 == 0 && input % 400 != 0) {
            System.out.println("It‘s not a leap year.");
        } else {
            System.out.println("It's a leap year");
        }
    }
}
