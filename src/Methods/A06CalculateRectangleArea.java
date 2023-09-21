package Methods;

public class A06CalculateRectangleArea {
    public static double CalculateRectangleArea(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        System.out.printf("%.2f", CalculateRectangleArea(4, 6));
    }
}
