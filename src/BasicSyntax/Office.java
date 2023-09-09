package BasicSyntax;

import java.util.Scanner;

public class Office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        double first = n;
        double second = first * 0.80;
        double third = (first + second) * 1.15;

        System.out.printf("BasicSyntax.First: %.3f\nBasicSyntax.Second: %.3f\nThird: %.3f\nAll: %.3f", first, second, third, first+second+third

        );
    }
}
