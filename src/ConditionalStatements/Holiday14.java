package ConditionalStatements;

import java.util.Scanner;

public class Holiday14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number = Float.parseFloat(sc.nextLine());
        String season = sc.nextLine();
        if (number <= 100) {
            if (season.equals("summer")) {
                System.out.printf("Somewhere in %s%nCamp - %.2f", "Bulgaria", number * 0.30);

            } else if (season.equals("winter")) {
                System.out.printf("Somewhere in %s%nHotel - %.2f", "Bulgaria", number * 0.70);
            }
        } else if (number <= 1000) {
            if (season.equals("summer")) {
                System.out.printf("Somewhere in %s%nCamp - %.2f", "Europe", number * 0.40);

            } else if (season.equals("winter")) {
                System.out.printf("Somewhere in %s%nHotel - %.2f", "Europe", number * 0.80);
            }
        } else {
            if (season.equals("summer")) {
                System.out.printf("Somewhere in %s%nCamp - %.2f", "Asia", number * 0.90);

            } else if (season.equals("winter")) {
                System.out.printf("Somewhere in %s%nHotel - %.2f", "Asia", number * 0.90);
            }
        }


    }
}
