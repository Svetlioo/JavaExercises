import java.util.Scanner;

public class CarsDistance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int distance = x * 5 - y * 3;
        System.out.println(distance);
    }
}
