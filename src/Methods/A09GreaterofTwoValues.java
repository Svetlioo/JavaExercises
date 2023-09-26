package Methods;

public class A09GreaterofTwoValues {

    public static int getMax(int x, int y) {
        if (x > y) return x;
        return y;
    }

    public static char getMax(char x, char y) {
        if (x > y) return x;
        return y;
    }

    public static String getMax(String x, String y) {
        if (x.compareTo(y) > 0) return x;
        return y;
    }

    public static void main(String[] args) {
        System.out.println(getMax(4, 6));
        System.out.println(getMax('a', 'z'));
        System.out.println(getMax("Ivan", "Todor"));
    }
}
