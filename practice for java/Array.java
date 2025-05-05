
import java.util.Scanner;

public class Array{
    int arr[];
    int size;
    Array(int s)
    {
        size=s;
        arr=new int[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter "+size+" integer ");
        for (int i=0;i<=size;i++){
            arr[i]=sc.nextInt();
        }}
        public void show (){
            System.out.println(" array in reverse is ...");
            for (int i=size-1;i>=0;i--){
                System.out.println(arr[i]+" ");
            }
        }
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the number of the elements");
            int n =sc.nextInt();
            Array o=new Array(n);
            o.show();
        }
}