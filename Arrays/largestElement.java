package Arrays;

import java.util.Scanner;

public class largestElement {
    public static int largestEle(int arr[]){
        int n = arr.length;
        int largest = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args){


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = s.nextInt(); 
            
        }
        
        System.out.println("The largest element is " + largestEle(arr));
        
        s.close();

    
    }
}
