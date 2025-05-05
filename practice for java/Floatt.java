
import java.util.Scanner;

public  class Floatt{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number ");
        float number =in.nextFloat();
        System.out.println("you entered the number  "+number);
        int num=(int)number;
        System.out.println("the integer part of the number is "+num);
        System.out.println("the fractional part of the number is "+(number -num));
       
        
    }
}