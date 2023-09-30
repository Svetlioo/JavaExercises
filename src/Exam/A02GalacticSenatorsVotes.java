package Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class A02GalacticSenatorsVotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s*,\\s*");
        Map<String, Integer> hashmap = new HashMap<>();
        String result;
        for (int i = 0; i < input.length; i++) {
            hashmap.put(input[i], hashmap.getOrDefault(input[i], 0) + 1);
        }

        int yesCount = hashmap.getOrDefault("Yes", 0);
        int noCount = hashmap.getOrDefault("No", 0);
        int abstainCount = hashmap.getOrDefault("Abstain", 0);
        if (yesCount == 0 && noCount == 0 && abstainCount > 0) {
            System.out.println("Abstain");
            return;
        }
        if (yesCount > noCount) {
            result = "Yes";
        } else if (noCount > yesCount) {
            result = "No";
        } else {
            result = "Tie";
        }
        System.out.println(result);
    }
}
