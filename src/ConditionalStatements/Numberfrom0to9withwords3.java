package ConditionalStatements;

import java.util.Scanner;

public class Numberfrom0to9withwords3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        String answer;
        switch (x) {
            case 1:
                answer = "one";
                break;
            case 2:
                answer = "two";
                break;
            case 3:
                answer = "three";
                break;
            case 4:
                answer = "four";
                break;
            case 5:
                answer = "five";
                break;
            case 6:
                answer = "six";
                break;
            case 7:
                answer = "seven";
                break;
            case 8:
                answer = "eight";
                break;
            case 9:
                answer = "nine";
                break;
            default:
                answer = "Too big!";
                break;

        }
        System.out.println(answer);
    }
}
