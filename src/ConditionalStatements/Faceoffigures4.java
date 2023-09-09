package ConditionalStatements;

import java.util.Scanner;

public class Faceoffigures4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();


        switch (shape) {
            case "square" -> {
                double x = Double.parseDouble(sc.nextLine());
                System.out.printf("%.2f", x * x);
            }
            case "rectangle" -> {
                double x = Double.parseDouble(sc.nextLine());
                double y = Double.parseDouble(sc.nextLine());
                System.out.printf("%.2f", x * y);
            }
            case "triangle" -> {
                double x = Double.parseDouble(sc.nextLine());
                double y = Double.parseDouble(sc.nextLine());
                System.out.printf("%.2f", (x * y) / 2);
            }
            case "circle" -> {
                double x = Double.parseDouble(sc.nextLine());
                System.out.printf("%.2f", Math.PI * Math.pow(x, 2));
            }
            default -> System.out.println("Not valid");
        }
    }
}
