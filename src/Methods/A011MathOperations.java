package Methods;

import java.util.Scanner;

public class A011MathOperations {
    public static double MathOperations(double x, double y, String operator) {
        double result = 0;
        switch (operator) {
            case "+" -> result = x + y;
            case "-" -> result = x - y;
            case "*" -> result = x * y;
            case "/" -> result = x / y;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        double y = Integer.parseInt(sc.nextLine());
        System.out.printf("%.2f",MathOperations(x, y, operator));
    }
}
