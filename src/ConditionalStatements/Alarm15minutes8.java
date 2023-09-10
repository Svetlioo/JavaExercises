package ConditionalStatements;

import java.util.Scanner;

public class Alarm15minutes8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingHour = Integer.parseInt(sc.nextLine());
        int startingMinutes = Integer.parseInt(sc.nextLine());
//        for (int hour = startingHour; hour < startingHour + 1; hour++) {
//            for (int minute = startingMinutes; minute < 59; minute++) {
//                System.out.printf("%d:%02d%n", hour, minute);
//            }
//        }
        if (startingMinutes < 45) {
            System.out.printf("%d:%02d%n", startingHour, startingMinutes + 15);
        } else {
            System.out.printf("%d:%02d%n", startingHour + 1, startingMinutes - 45);
        }
    }
}
