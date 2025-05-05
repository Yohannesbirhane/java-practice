
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       

        System.out.println("enter the non negative number ");
        int  num=scn.nextInt();
        if (num<0){
            System.out.println("negative number has no factorial");
           

        }
        else{
            long  fact=1;
            for (int i = 1; i <= num; i++) {
            fact*=i;
                
            }
            System.out.println("factorial of the number "+num+"is "+fact);
        }
    }
}