
import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your mass in kilogram");
        float mass=input.nextFloat();
        System.out.println("Enter your height in meter ");
        float height=input.nextFloat();
        float bmi;
        if (mass<=0||height<=0){
            System.out.println("Invalid input! mass and height  can not be negative or zero");
        }
       bmi=mass/(height*height);
        System.out.println("your body mass index is "+bmi);
        if (bmi>20&&bmi<=23){
            System.out.println("your weight is better please keep wait!");}
        else if (bmi>23&&bmi<27) {
            System.out.println("you are overweight please adjust your self ");
        } 
        else if (bmi>=27){
            System.out.println("you are obesty");
        } 
         else if (bmi<20){
            System.out.println("your are under weight please eat balanced nuitrent food");
         }
        }
    }


