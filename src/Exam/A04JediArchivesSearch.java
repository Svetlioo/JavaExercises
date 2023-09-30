package Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A04JediArchivesSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s*,\\s*");
        String search = sc.nextLine();
        Map<String, Map<String, Integer>> hashmap = new HashMap<>();
        // Правя Hashmap в Hashmapa, като във вътрешния запазвам първото и последното срещане, а във първия hashmap -
        // името и вътрешния hashmap.
        for (int i = 0; i < input.length; i++) {
            String name = input[i];
            if (hashmap.containsKey(name)) {
                Map<String, Integer> innerMap = hashmap.get(name);
                innerMap.put("Last Occurrence", i);
            } else {
                Map<String, Integer> innerMap = new HashMap<>();
                innerMap.put("First Occurrence", i);
                innerMap.put("Last Occurrence", i);
                hashmap.put(name, innerMap);
            }
        }

        if (hashmap.containsKey(search)) {
            Map<String, Integer> innerMap = hashmap.get(search);
            int firstOccurrence = innerMap.get("First Occurrence");
            int lastOccurrence = innerMap.get("Last Occurrence");
            System.out.println("First Occurrence: " + firstOccurrence);
            System.out.println("Last Occurrence: " + lastOccurrence);
        } else {
            System.out.println("Record not found");
        }
    }
}



