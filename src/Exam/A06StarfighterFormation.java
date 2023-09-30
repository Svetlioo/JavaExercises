package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A06StarfighterFormation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> starFormation = new ArrayList<>();
        for (int element : arr) {
            starFormation.add(element);
        }

        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] inputArr = input.split("\\s+");
            boolean printArray = true;
            switch (inputArr[0]) {
                case "destroy" -> {
                    int indexToDestroy = Integer.parseInt(inputArr[1]);
                    if (indexToDestroy >= 0 && indexToDestroy < starFormation.size()) {
                        starFormation.remove(indexToDestroy);
                    } else {
                        printArray = false;
                    }
                }
                case "add" -> {
                    int numToAdd = Integer.parseInt(inputArr[1]);
                    starFormation.add(numToAdd);
                }
                case "swap" -> {
                    int indexOne = Integer.parseInt(inputArr[1]);
                    int indexTwo = Integer.parseInt(inputArr[2]);
                    if (indexOne >= 0 && indexTwo >= 0 && indexOne < starFormation.size() && indexTwo < starFormation.size() && indexOne != indexTwo) {
                        int temp = starFormation.get(indexOne);
                        starFormation.set(indexOne, starFormation.get(indexTwo));
                        starFormation.set(indexTwo, temp);
                    } else {
                        printArray = false;
                    }
                }
                case "insert" -> {
                    int valueToInsert = Integer.parseInt(inputArr[1]);
                    int indexToInsert = Integer.parseInt(inputArr[2]);
                    if (indexToInsert >= 0 && indexToInsert <= starFormation.size()) {
                        starFormation.add(indexToInsert, valueToInsert);
                    }
                }
                case "center" -> {
                    int centerIndex = starFormation.size() / 2;
                    if (starFormation.size() % 2 == 0) {
                        System.out.printf("%d %d%n", starFormation.get(centerIndex - 1), starFormation.get(centerIndex));
                    } else {
                        System.out.println(starFormation.get(centerIndex));
                    }
                    printArray = false;
                }
            }
            if (printArray) {
                for (int i = 0; i < starFormation.size(); i++) {
                    System.out.print(starFormation.get(i));
                    if (i < starFormation.size() - 1) {
                        System.out.print(" "); // Правя го, за да не принтирам whitespace след Starfighter Formationa
                    }
                }
                System.out.println();
            }
        }
    }
}
