package SetsMaps;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A03CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
