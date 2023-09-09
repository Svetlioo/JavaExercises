package ConditionalStatements;

import java.util.Scanner;

public class Largernumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        if (x > y) {
            System.out.println(x);
        } else if (x < y) {
            System.out.println(y);
        } else {
            System.out.println("equal");
        }
    }
}
