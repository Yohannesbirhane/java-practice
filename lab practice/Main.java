import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            if (number >0 && number < 1000) {
                int sum = 0, temp = number;
                
                while (temp > 0) {
                    sum += temp % 10; 
                    temp /= 10; 
                }
                
                System.out.println("The sum of all digits in " + number + " is " + sum);
            } else {
                System.out.println("Number out of range. Please enter a number between 0 and 1000.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
