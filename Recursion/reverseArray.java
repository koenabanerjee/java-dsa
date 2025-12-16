package Recursion;

import java.util.Scanner;

public class reverseArray {
    

public static void func(int i, int arr[], int size){
    if(i>=size/2) {
        return;

    }
    int temp = arr[i];
    arr[i] = arr[size-i-1];
    arr[size-i-1] = temp;
    func(i+1,arr,size);
      
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
        
        func(0,arr,size);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            
            
        }
        s.close();

    }
}