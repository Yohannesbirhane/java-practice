
import java.util.Scanner;

public  class  Input {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter an intiger ");
        int number=x.nextInt ();
        System.out.println("you Enterd the number"+" "+number);
        x.close();
    }
}