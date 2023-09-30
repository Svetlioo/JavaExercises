package Exam;

import java.util.Scanner;

public class A03SithCodeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int shift;
        do {
            s = sc.nextLine();
        } while (s.isEmpty() || s.length() > 100); // Това го правя, за да вляза в условието s да е (1 ≤ |s| ≤ 100).
        do {
            shift = Integer.parseInt(sc.nextLine());
        } while (shift < 1 || shift > 25); // Това го правя, за да вляза в условието shifta да е (1 ≤ n ≤ 25).

        StringBuilder result = new StringBuilder();
// За инпута и аутпута от примера R2-D2 като гледам е напред, а не назад. Затова ще предположа, че ако има цифри в инпута ще местя
// напред в азбуката, а в другия случай назад.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                char purvaBukva;
                char bukva = c;
                if (Character.isUpperCase(c)) {
                    purvaBukva = 'A';
                } else {
                    purvaBukva = 'a';
                }

//                Тук в коментар съм написал начина на първия аутпут за да местя назад в азбуката.
//                for (int j = 0; j < shift; j++) {
//                    bukva--;
//                    if (bukva < purvaBukva) {
//                        bukva = (char) (purvaBukva + 25); // правя тази проверка, когато връщам от първата буква назад - от a към z.
//                    }
//                }
//                result.append(bukva);


                for (int j = 0; j < shift; j++) {
                    bukva++;
                    if (Character.compare(bukva, 'z') == 0 || Character.compare(bukva, 'Z') == 0) {
                        bukva = (char) (purvaBukva); // правя тази проверка, когато минавам от последната към първата буква - от z към a.
                    }
                }
                result.append(bukva);
//              Тук съм написал начина на последния аутпут за да добавям напред в азбуката и за цифрите също.
//                 R2-D2
//                 5
//                 Output:
//                 W7-I7

            } else if (Character.isDigit(c)) {
                int num = Integer.parseInt(String.valueOf(c));
                result.append(num + shift);
            } else {
                result.append(c);
            }

        }

        System.out.println(result);

    }
}
