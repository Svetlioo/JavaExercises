package BasicSyntax;

import java.util.Scanner;

public class Rooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double red = 1;
        double yellow = 4;
        double white = 8;

        double redPaint = n / (red+yellow+white) * red;
        double yellowPaint = n / (red+yellow+white) * yellow;
        double whitePaint = n / (red+yellow+white) * white;
        System.out.printf("Yellow: %.4f \nRed: %.4f \nWhite: 6%.4f", yellowPaint, redPaint, whitePaint);
    }
}
