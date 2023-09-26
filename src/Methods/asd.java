package Methods;

public class asd {
    public static void main(String[] args) {
        System.out.println(reverseWords("  the  sky  is  blue     "));

    }
    public static String reverseWords(String s){
        String[] arr = s.trim().split("\\s+");
        StringBuilder a = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            a.append(arr[i]).append(" ");
        }
        return a.toString();
    }
}
