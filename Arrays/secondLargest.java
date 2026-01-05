package Arrays;

import java.util.Scanner;

public class secondLargest {
    public static int secondLargestEle(int arr[]){
        int n = arr.length;
        int largest = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        for(int i = 0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
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
        
        System.out.println("The largest element is " + secondLargestEle(arr));
        
        s.close();

    
    }
}
