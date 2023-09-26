package Methods;

import java.util.Scanner;

public class A08MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = Double.parseDouble(sc.nextLine());
        int pow = Integer.parseInt(sc.nextLine());
        System.out.println(power(num,pow));
    }
    public static double power(double num, int pow) {
        double result = 1;
        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }
}
