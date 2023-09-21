package Methods;

public class A04Calculator {
    public static double Calculator(String operator, double x, double y) {
        double result = 0;
        switch (operator) {
            case "add" -> result = x + y;
            case "subtract" -> result = x - y;
            case "multiply" -> result = x * y;
            case "divide" -> result = x / y;
            default -> System.out.println("Error");
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Calculator("subtract", 7, 4));
    }
}
