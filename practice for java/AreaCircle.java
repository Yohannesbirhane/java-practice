
import java.util.Scanner;

public class AreaCircle {
public static void main(String[] args) {
Scanner input= new Scanner(System.in);
    double radius,area;
    System.out.print ("enter the radius of the circle ");
    radius=input.nextDouble();
    area=Math.PI*radius*radius;
    System.out.printf("the area of the circle is %f%n",area);

}
}