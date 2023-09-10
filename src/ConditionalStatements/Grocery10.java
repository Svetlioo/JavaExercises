package ConditionalStatements;

import java.util.Scanner;

public class Grocery10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double coffee = 0, water = 0, juice = 0, sweets = 0, chips = 0;

        String product = sc.nextLine();
        String city = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        switch (city) {
            case "Sofia":
                coffee = 0.50;
                water = 0.80;
                juice = 1.20;
                sweets = 1.45;
                chips = 1.60;
                break;
            case "Plovdiv":
                coffee = 0.40;
                water = 0.70;
                juice = 1.15;
                sweets = 1.30;
                chips = 1.50;
                break;
            case "Varna":
                coffee = 0.45;
                water = 0.70;
                juice = 1.10;
                sweets = 1.35;
                chips = 1.55;
                break;
            default:
                System.out.println("No such city");

        }
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", coffee * quantity);
                break;
            case "water":
                System.out.printf("%.2f", water * quantity);
                break;
            case "juice":
                System.out.printf("%.2f", juice * quantity);
                break;
            case "sweets":
                System.out.printf("%.2f", sweets * quantity);
                break;
            case "chips":
                System.out.printf("%.2f", chips * quantity);
                break;
            default: {
                System.out.println("Error");
            }
        }
    }
}
