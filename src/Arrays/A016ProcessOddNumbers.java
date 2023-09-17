package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A016ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<Integer> finalArray = new ArrayList<>();
        for (int i = 1; i < arr.length; i += 2) {
            finalArray.add(arr[i] * 2);
        }
        for (int i = 0; i < finalArray.size() / 2; i++) {
            int temp = finalArray.get(i);
            finalArray.set(i, finalArray.get(finalArray.size() - i - 1));
            finalArray.set(finalArray.size() - i - 1, temp);
        }
        System.out.println(finalArray);
    }
}
