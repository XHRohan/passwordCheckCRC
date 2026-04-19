import java.util.Scanner;

class PasswordCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Type a password to check: ");
        String input = sc.nextLine();

        int upper = 0, lower = 0, digit = 0, symbol = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    upper++;
                } else {
                    lower++;
                }
            } else if (Character.isDigit(c)) {
                digit++;
            } else {
                symbol++;
            }
        }

        System.out.println("\nResult");
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Numbers: " + digit);
        System.out.println("Symbols: " + symbol);

        if (input.length() >= 8 && upper > 0 && lower > 0 && digit > 0 && symbol > 0) {
            System.out.println("Strong");
        } else if (input.length() >= 6 && (upper + lower) > 0 && digit > 0) {
            System.out.println("Medium");
        } else {
            System.out.println("Weak");
        }
    }
}
