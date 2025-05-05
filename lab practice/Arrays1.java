import java.util.Arrays;
import java.util.Scanner;

public class Arrays1{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        int[] array = {100, 24, 127, 387, 45, 378, 1000};
        
        
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array));
        
        
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        

        Arrays.sort(array);
        
       
        System.out.print(k + " largest elements of the array are: ");
        for (int i = array.length - 1; i >= array.length - k; i--) {
            System.out.print(array[i] + " ");
        }
        
        
        scanner.close();
    }
}
