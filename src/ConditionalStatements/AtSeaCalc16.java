package ConditionalStatements;

import java.util.Scanner;

public class AtSeaCalc16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        String room = sc.nextLine();
        String assessment = sc.nextLine();
        double totalPrice = 0;
        double roomPrice = 0;
        switch (room) {
            case "single room" -> roomPrice = 25;
            case "apartment" -> roomPrice = 50;
            case "presidential" -> roomPrice = 100;
        }
        if (days < 10) {
            switch (room) {
                case "single room" -> totalPrice = roomPrice * (days - 1);
                case "apartment" -> totalPrice = (roomPrice * (days - 1)) * 0.60;
                case "presidential" -> totalPrice = (roomPrice * (days - 1)) * 0.90;
            }
        } else if (days < 15) {
            switch (room) {
                case "single room" -> totalPrice = roomPrice * (days - 1);
                case "apartment" -> totalPrice = (roomPrice * (days - 1)) * 0.65;
                case "presidential" -> totalPrice = (roomPrice * (days - 1)) * 0.85;
            }
        } else {
            switch (room) {
                case "single room" -> totalPrice = roomPrice * (days - 1);
                case "apartment" -> totalPrice = (roomPrice * (days - 1)) * 0.50;
                case "presidential" -> totalPrice = (roomPrice * (days - 1)) * 0.80;
            }
        }


        if (assessment.equals("positive")) {
            totalPrice *= 1.25;
        } else {
            totalPrice *= 0.90;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }


}
