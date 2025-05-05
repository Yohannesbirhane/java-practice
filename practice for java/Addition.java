
import java.util.*;

public class Addition{
    public static void main(String[] args) {
      Scanner input =new  Scanner(System.in) ;
      int num1,num2,sum;
     
      System.out.println("enter the first number ");
      num1=input.nextInt();
      System.out.println("enter the second number ");
      num2=input.nextInt();
      sum=num1+num2;
      System.out.println("the sum of "+ num1 +" and "+ num2+"  is " +sum);


    }
}