package Loops;

import java.util.Scanner;

public class A017NewBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floors = Integer.parseInt(sc.nextLine());
        int rooms = Integer.parseInt(sc.nextLine());
        String type;
        for (int i = floors; i >= 1; i--) {
            if (i % 2 == 0) {
                type = "O";
            } else {
                type = "A";
            }
            if (i == floors) {
                type = "L";
            }

            for (int j = 0; j < rooms; j++) {
                System.out.printf("%s%d%d ", type, i, j);
            }
            System.out.print("\n");
        }
    }
}
