package SetsMaps;

import java.text.Format;
import java.util.*;

public class A02AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<Double>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            if (!map.containsKey(input[0])) {
                map.put(input[0], new ArrayList<>());
            }
            map.get(input[0]).add(Double.parseDouble(input[1]));
        }
        for (Map.Entry<String, ArrayList<Double>> entry : map.entrySet()) {
            StringBuilder grades = new StringBuilder();
            double average = 0;
            for (double val : entry.getValue()) {
                grades.append(String.format("%.2f", val)).append(" ");
                average += val;
            }
            average /= entry.getValue().size();
            System.out.printf(entry.getKey() + " -> " + grades + "(avg: %.2f)%n", average);
        }
    }
}
