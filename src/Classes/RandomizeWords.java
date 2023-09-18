package Classes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String[] arr = sc.nextLine().split("\\s* \\s*");
        for (int i = 0; i < arr.length; i++) {
            int index = rnd.nextInt(arr.length);
            String temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
