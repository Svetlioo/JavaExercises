package Arrays;

import java.util.Scanner;

public class A02DayofWeek {
    public static void main(String[] args) {
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());
        if(1 <= day && day <= 7) {
            System.out.println(days[day - 1]);
            return;
        }
        System.out.println("Invalid day!");

    }
}
