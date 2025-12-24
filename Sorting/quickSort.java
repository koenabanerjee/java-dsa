package Sorting;

import java.util.Scanner;

public class quickSort {
    public static int func(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low+1;
        int j = high;
        while(i<j){
            while( i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot  ){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    public static void qSort(int arr[],int low, int high){
        if(low<high){
            int pIdx = func(arr,low,high);
            qSort(arr, low, pIdx-1);
            qSort(arr, pIdx+1, high);
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
        
        qSort(arr,0,size-1);
        System.out.print("The sorted array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            
            
        }
        s.close();

    }
}
