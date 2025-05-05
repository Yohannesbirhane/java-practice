
import java.util.Scanner;

public class Evenodd{
    public static void main(String[] args) {
        Scanner check=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number= check.nextInt();
        if (number%2==0){
            System.out.println("the number "+number+" is even ");}
        else   {
            System.out.println("the number "+number+" is odd ");
        }
       


    }
}