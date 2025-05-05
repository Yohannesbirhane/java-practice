
import java.util.Scanner;

public class Comparison{
   public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       int number1,number2;
       System.out.print("Enter the first number ");
       number1=input.nextInt();
       System.out.print("Entr the second number");
       number2=input.nextInt();
       System.out.println(number1==number2);
         System.out.println(number1!=number2);
           System.out.println(number1>=number2);
             System.out.println(number1<=number2);
               System.out.println(number1>number2);
   } 
}