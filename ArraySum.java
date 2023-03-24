import java.util.*;
 
public class ArraySum {
    public static void main(String args[]) {
        int count, num, i, sum = 0;
        int[] inputArray = new int[500];
   
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter Number of Elements:");
        count = in.nextInt();
        System.out.println("Enter " +  count + " Elements");
        for(i = 0; i < count; i++) {
            inputArray[i] = in.nextInt();
        }
        in.close();
 
        System.out.print("Sum of the Array: ");
        for(int element : inputArray){
            sum = sum + element;
        }
        System.out.println(sum);
    }
    
}