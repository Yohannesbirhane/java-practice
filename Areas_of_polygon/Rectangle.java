
import java.util.Scanner;

public  class Rectangle{
    public static void main(String[] args) {
        Scanner rect =new Scanner(System.in);
        float length,width,area;
        System.out.println("Enter the length ");
        length=rect.nextFloat();
        System.out.println("Enter the width");
        width=rect.nextFloat();
        area=length*width;
        System.out.println("the area of the rectangle with length "+length+" and width  "+width +" is "+ area);


        
        
        
            }
}