
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner crcl = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = crcl.nextDouble();  
        
        double area = Math.PI * radius * radius;  
        
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        
        crcl.close();  // Close the scanner to prevent resource leaks
    }
}
