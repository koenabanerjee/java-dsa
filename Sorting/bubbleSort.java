package Sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void bubSort(int arr[]){
        int n = arr.length;
        for(int i = n-1;i>=1;i--){ //Outer loop - number of passes
            int didSwap = 0;
            for(int j=0;j<i;j++){ //Inner loop - number of comparisons
                if(arr[j] > arr[j+1]){
                    //SWAP
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }

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
        
        bubSort(arr);
        System.out.print("The sorted array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            
            
        }
        s.close();

    }
}
