package SetsMaps;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A01CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Double, Integer> occurrences = new LinkedHashMap<>();
        String[] input = sc.nextLine().split("\\s+");
        for (int i = 0; i < input.length; i++) {
            double current = Double.parseDouble(input[i]);
            if (occurrences.containsKey(current)) {
                occurrences.put(current, occurrences.get(current) + 1);
            } else {
                occurrences.put(current, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
