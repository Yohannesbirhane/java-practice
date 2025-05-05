
import java.util.Scanner;

public class  Swap{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the firtst number ");
        int num1=input.nextInt();
        System.out.println("Enter the second number ");
        int num2=input.nextInt();
        System.out.println("numbers before swap num1=  "+num1+" and "+" num2= "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("numbers after swap num1=  "+num1+" and "+"  num2= "+num2);
    }
}

// import java.util.Scanner;

// public  class SWapT{
//     public static void main(String[] args) {
//         Scanner input =new Scanner (System.in);
//         System.out.println("Enter the first number you want to swap");
//         int first=input.nextInt();
//          System.out.println("Enter the second number you want to swap");
//          int second=input.nextInt();
//          System.out.println("The two numbers before swap are "+"  the first=  "+first+"  the second=  "+second);
//          int temp;
//          temp=first;
//          first=second;
//          second=temp;
//          System.out.println("The two numbers after swap are "+"  the first= "+first+"   the second= "+second);
         

//     }
// }