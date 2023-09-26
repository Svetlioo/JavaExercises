package Methods;

import java.util.Scanner;

public class A07RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(RepeatString(str, n));
    }
    public static String RepeatString(String str, int n) {
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            strb.append(str);
        }
        return strb.toString();
    }
}
