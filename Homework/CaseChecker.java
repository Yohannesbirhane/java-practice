import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a single character: ");
        char letter = input.next().charAt(0);
        

        if (Character.isUpperCase(letter)) {
            System.out.println(letter + " is an uppercase letter.");
        } else if (Character.isLowerCase(letter)) {
            System.out.println(letter + " is a lowercase letter.");
        } else {
            System.out.println(letter+ " is neither uppercase nor lowercase.");
        }
        
        
    }
}
