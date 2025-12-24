package Sorting;
import java.util.Scanner;

public class recursiveBubble {
    public static void recurBubbleSort(int arr[], int n){
           //Base case - If only one element is there the array is already sorted.
           if(n == 1) return;
           boolean didSwap = false;

           //doing 1 iteration over the whole array - pushing the largest element to the last
           for(int j=0;j<=n-2;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1]; 
                arr[j+1] = temp;
                didSwap = true;
            }
            
           }
           if(!didSwap) return;
           //calling recursion function for the rest of the elements
           recurBubbleSort(arr, n-1);

        }
    
      
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = s.nextInt(); 
            
        }
        
        recurBubbleSort(arr, size);
        System.out.print("The sorted array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            
            
        }
        s.close();

    }
    
}
