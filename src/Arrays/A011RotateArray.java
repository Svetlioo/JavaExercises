package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A011RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\s*,\\s*");
        String[] rotatedArray = new String[arr.length];

        int rotations = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            int newIndex = (i + rotations) % arr.length;
            rotatedArray[newIndex] = arr[i];
        }
        System.out.println(Arrays.toString(rotatedArray));
        }
    }

