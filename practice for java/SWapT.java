
import java.util.Scanner;

public class  SWapT{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first;
        System.out.println("enter first  the number  ");
        first=sc.nextInt();
        int second;
        System.out.println("enter the second number ");
        second=sc.nextInt();
        int tempo;
    System.out.println("the two number before swap are   "+first+" "+second);
       tempo=first;
       first=second;
       second=tempo;
       System.out.println("the two numbers after swap are  "+first+" "+second);

    }
}