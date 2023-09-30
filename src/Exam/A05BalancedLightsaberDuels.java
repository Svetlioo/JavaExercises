package Exam;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class A05BalancedLightsaberDuels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayList<String> thirdSymbolCount = new ArrayList<>();
        // Добавям всеки ! в лист и после проверявам дължината на листа - ако е нечетна - Not Legendary, защото остава един
        // power strike technique ! от Jedi без да е върнат another power strike technique ! от Sith. Ако е четна - Legendary
        // Мога да използвам директно int count вместо този списък, ако искам да използвам по-малко памет.
        ArrayList<Integer> indexesOfThirdSymbol = new ArrayList<>();
        // Добавям всеки индекс на !, за да видя дали са последователни - ако има 4 и след това 6, а не 5 - връща Not Legendary
        // за да работи по този начин :  {!}!   -->  Not Legendary
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            String curr = Character.toString(input.charAt(i));
            switch (curr) {
                case "!" -> {
                    thirdSymbolCount.add(curr);
                    indexesOfThirdSymbol.add(i);
                }
                case "(", "{" -> stack.push(curr);

                case ")" -> {
                    if (!stack.pop().equals("(")) {
                        System.out.println("Not Legendary");
                        return;
                    }
                }
                case "}" -> {
                    if (!stack.pop().equals("{")) {
                        System.out.println("Not Legendary");
                        return;
                    }
                }
            }
        }
//      System.out.println(thirdSymbolCount);
//      System.out.println(indexesOfThirdSymbol);
        boolean thirdSymbolEven = thirdSymbolCount.size() % 2 == 0;
        for (int i = 0; i < indexesOfThirdSymbol.size() - 1; i++) {
            int current = indexesOfThirdSymbol.get(i);
            int next = indexesOfThirdSymbol.get(i + 1);
            if (next != current + 1) {
                System.out.println("Not Legendary");
                return;
            }
            indexesOfThirdSymbol.remove(i);
            indexesOfThirdSymbol.remove(i + 1);
        }
//      Проверката на това дали има another power strike technique ! от Sith, веднага след първото power strike technique ! от Jedi

        if (stack.isEmpty() && thirdSymbolEven) {
            System.out.println("Legendary");
        } else {
            System.out.println("Not Legendary");
        }

    }
}
