package Methods;

import java.util.Scanner;

public class A012PasswordValidator {
    public static void PasswordValidator(String password) {
        boolean isValid = true;
        if (password.length() < 6 || password.length() > 10) {
            isValid = false;
            System.out.println("Password must be between 6 and 10 characters.");
        }


        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
                System.out.println("Password must contain only letters and digits.");
                isValid = false;
                break;
            }
        }
        int numOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numOfDigits++;
            }
            if (numOfDigits >= 2) {
                break;
            }
        }
        if (numOfDigits < 2) {
            System.out.println("Password must have at least 2 digits.");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        PasswordValidator(password);

    }
}
