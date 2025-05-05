import java.util.Scanner;

public class Characterchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);  // Read first character of user input

        if (Character.isUpperCase(ch)) {
            System.out.println("The character is uppercase.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("The character is lowercase.");
        } else {
            System.out.println("The character is not a letter.");
        }

        scanner.close();
    }
}
