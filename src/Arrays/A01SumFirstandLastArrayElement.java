package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A01SumFirstandLastArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = Arrays
                .stream(str.split("\\s*,\\s* "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        System.out.printf("First: %d%nLast: %d", arr[0], arr[arr.length - 1]);
    }
}
