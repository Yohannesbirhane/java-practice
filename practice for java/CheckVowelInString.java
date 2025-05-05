import java.util.Scanner;

public class CheckVowelInString {
    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sanner.nextLine().toLowerCase(); // Convert to lowercase for easier checking

        boolean vowelPresent = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelPresent = true;
                break;
            }
        }

        if (vowelPresent) {
            System.out.println("The string contains at least one vowel.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }

        
    }
}