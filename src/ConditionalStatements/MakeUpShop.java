package ConditionalStatements;

import java.util.Scanner;

public class MakeUpShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = Double.parseDouble(sc.nextLine());
        int powder = Integer.parseInt(sc.nextLine());
        int lipstick = Integer.parseInt(sc.nextLine());
        int spiral = Integer.parseInt(sc.nextLine());
        int shadows = Integer.parseInt(sc.nextLine());
        int concealer = Integer.parseInt(sc.nextLine());

        double amount = powder * 2.60 + lipstick * 3 + spiral * 4.10 + shadows * 8.20 + concealer * 2;

        if ((powder + lipstick + spiral + shadows + concealer) >= 50) {
            amount *= 0.75;
        }
        double profit = amount * 0.90;
        if (profit > number) {
            System.out.printf("Yes! %.2f lv left.", profit - number);
        } else {
            System.out.printf("Not enough money!\n%.2f lv needed.", number - profit);
        }
    }
}
