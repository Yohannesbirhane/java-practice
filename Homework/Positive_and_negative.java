
import java.util.Scanner;

public class Positive_and_negative{
    public static void main(String[] args) {
        Scanner check=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number= check.nextInt();
        if (number>0){
            System.out.println("the number "+number+" is positive");}
        else if(number<0)  {
            System.out.println("the number "+number+" is negative ");
        }
        else{
            System.out.println("the number "+number+" is zero");
        }
       


    }
}