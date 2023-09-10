package ConditionalStatements;

import java.util.Scanner;

public class SimpleCalc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        String operation = sc.nextLine();
        switch (operation) {
            case "add": {
                System.out.printf(("%.2f"), x + y);
                break;
            }
            case "subtract": {
                System.out.printf(("%.2f"), x - y);
                break;
            }
            case "divide": {
                System.out.printf(("%.2f"), x / y);
                break;
            }
            case "multiply": {
                System.out.printf(("%.2f"), x * y);
                break;
            }
        }
    }
}
