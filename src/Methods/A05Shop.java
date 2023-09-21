package Methods;


public class A05Shop {
    public static double Shop(String product, int quantity) {
        double result = 0;
        switch (product) {
            case "coffee" -> result = 1.50 * quantity;
            case "water" -> result = 1.00 * quantity;
            case "coke" -> result = 1.40 * quantity;
            case "snacks" -> result = 2.00 * quantity;
            default -> System.out.println("Error");
        }

//        return Double.parseDouble(String.format("%.2f", result));
        return result;

    }

    public static void main(String[] args) {

        System.out.printf("%.2f", Shop("snacks", 5));
    }
}
