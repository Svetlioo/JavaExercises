package BasicSyntax;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = Integer.parseInt(sc.nextLine());
        int minutesLeft = minutes % 60;
        int hours = minutes / 60;
        if (hours > 10 && minutesLeft > 10) {
            System.out.printf("%d:%d", hours, minutesLeft);
        } else if (hours < 10 && minutesLeft > 10) {
            System.out.printf("0%d:%d", hours, minutesLeft);
        } else if (hours > 10 && minutesLeft < 10) {
            System.out.printf("%d:0%d", hours, minutesLeft);
        } else {
            System.out.printf("0%d:0%d", hours, minutesLeft);
        }
    }
}
