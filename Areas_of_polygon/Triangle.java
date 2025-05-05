
import java.util.Scanner;

public  class Triangle{
    public static void main(String[] args) {
        Scanner tri =new Scanner(System.in);
        float height,base,area;
        System.out.println("Enter the Height ");
        height=tri.nextFloat();
        System.out.println("Enter the base");
        base=tri.nextFloat();
        area=0.5f*height*base;
        System.out.println("the area of the triangle with height "+height+" and base  "+base+" is "+ area);


        
        
        
            }
}