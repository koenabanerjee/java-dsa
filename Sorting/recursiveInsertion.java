package Sorting;

import java.util.Scanner;

public class recursiveInsertion {
      public static void recurInsertSort(int arr[],int i, int n){
           if(i==n) return; //base case - all elements are covered
            int j = i;
           while(j>0 && arr[j-1] > arr[j]){
            //swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
           }

           //recurring for next index
           recurInsertSort(arr, i+1, n);

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
        
        recurInsertSort(arr,0, size);
        System.out.print("The sorted array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            
            
        }
        s.close();

    }
}
