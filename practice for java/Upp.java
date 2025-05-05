
import java.util.Scanner;

public class Upp{
    public static void main(String[] args) {
        Scanner mn=new Scanner(System.in);
        System.out.println("enter the char ");
        char ch=mn.next().charAt(0);
        if (ch>='A'&&ch<='Z') {
            System.out.println("upper");

        }
        else if(ch>='a'&& ch<='z')
        System.out.println("lower");
    }

} 