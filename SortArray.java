import java.util.*;

public class SortArray{

    public static void main(String args[]) {

        int swap;
        int size;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number of Elements:");
        size = scan.nextInt();

        int inputArray [] = new int[size];

        System.out.println("Enter " +  size + " Elements");
        for(int i = 0; i < size; i++) {
            inputArray[i] = scan.nextInt();
        }
        scan.close();

        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(inputArray[i] > inputArray[j]){
                    swap = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = swap;
                }
            }           
        }

        System.out.println("Sorted Array:");
        for(int i = 0; i < size; i++){
            System.out.print(inputArray[i] + " ");
        }
    
    }
}
