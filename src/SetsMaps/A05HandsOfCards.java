package SetsMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A05HandsOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            String[] input = sc.nextLine().split("\\s+");
            if (input[0].equals("JOKER")) break;
            for (int i = 1; i < input.length; i++) {
                int sum = 0;
                char card = input[i].charAt(0);
                String amplifier = String.valueOf(input[i].charAt(1));
                if (Character.isDigit(card)) {
                    sum += Integer.parseInt(String.valueOf(card));
                } else {
                    switch (card) {
                        case 'J' -> sum += 11;
                        case 'Q' -> sum += 12;
                        case 'K' -> sum += 13;
                        case 'A' -> sum += 14;
                    }
                }
                switch (amplifier) {
                    case "S" -> sum *= 4;
                    case "H" -> sum *= 3;
                    case "D" -> sum *= 2;
//                    case "C" -> sum *= 1;
                }
                String person = input[0].substring(0, input[0].length() - 1);
                if (!map.containsKey(person)) {
                    map.put(person, sum);
                } else {
                    map.put(person, map.get(person) + sum);
                }

            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
