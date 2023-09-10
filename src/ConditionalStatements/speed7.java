package ConditionalStatements;

import java.util.Scanner;

public class speed7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        if (input <= 10) {
            System.out.println("slow");
        } else if (input < 60) {
            System.out.println("average");
        } else if (input < 120) {
            System.out.println("fast");
        } else if (input < 160) {
            System.out.println("super-fast");
        } else {
            System.out.println("turbo-fast");
        }

    }
}
