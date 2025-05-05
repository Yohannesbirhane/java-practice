
import java.util.Scanner;

public  class  Exe{
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        System.out.println("Entr the number ");
        float num=y.nextFloat();
        System.out.println("you entered the number "+num);
        int intigerpart=(int) num;
        float fractionpart=num-intigerpart;
        System.out.println("intiger part is "+intigerpart);
        System.out.println("fraction part is "+fractionpart);

    }
}