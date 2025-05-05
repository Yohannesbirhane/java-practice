import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();          // Read a line of text (String)

        System.out.println("Hello, " + name + "!");

        scanner.close(); // Always close the Scanner
    }
}
