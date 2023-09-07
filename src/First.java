import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String town = sc.nextLine();
        int degrees = Integer.parseInt(sc.nextLine());
        System.out.printf("Today in %s it is %d degrees.", town, degrees);

    }
}
