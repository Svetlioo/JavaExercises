package Methods;

public class A01SignofInteger {
    public static String SignofInteger(int num) {
        if (num == 0) return "The number is zero";
        if (num > 0) {
            return "The number " + num + " is positive";
        }
        return "The number " + num + " is negative";
    }

    public static void main(String[] args) {
        System.out.println(SignofInteger(3));
        System.out.println(SignofInteger(-1));
        System.out.println(SignofInteger(0));
    }
}
