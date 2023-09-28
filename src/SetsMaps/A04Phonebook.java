package SetsMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A04Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        while (true) {
            String[] inputArr = sc.nextLine().split("-");
            if (inputArr.length == 1) {
                String input = inputArr[0];
                if (input.equals("stop")) return;
                if (input.equals("search")) {
                    String[] inputArrtoSearch = sc.nextLine().split("-");
                    while (inputArrtoSearch.length == 1) {
                        String toSearch = inputArrtoSearch[0];
                        if (toSearch.equals("stop")) return;
                        if (map.containsKey(toSearch)) {
                            System.out.printf("%s -> %s%n", toSearch, map.get(toSearch));
                        } else {
                            System.out.printf("Contact %s not found.%n", toSearch);
                        }
                        inputArrtoSearch = sc.nextLine().split("-");
                    }
                    map.put(inputArrtoSearch[0], inputArrtoSearch[1]);
                }

            } else {
                map.put(inputArr[0], inputArr[1]);
            }
        }
    }
}
