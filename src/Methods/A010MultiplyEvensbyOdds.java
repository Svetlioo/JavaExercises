package Methods;

public class A010MultiplyEvensbyOdds {
    public static int MultiplyEvensbyOdds(int n) {
        String numberString = String.valueOf(n);

        int even = 0;
        int odds = 0;
        for (int i = 0; i < numberString.length(); i++) {
            int num = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            if (num % 2 == 0) {
                even += num;
            } else {
                odds += num;
            }
        }
        return even * odds;
    }

    public static void main(String[] args) {
        System.out.println(MultiplyEvensbyOdds(12345));
    }
}
