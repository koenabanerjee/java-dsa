package Arrays;

import java.util.Scanner;

public class rightRotation {
    public static void reverse(int start, int end, int arr[]) {
    if(start >= end) return;

    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    reverse(start + 1, end - 1, arr);
}


    public static void rotArray(int arr[], int d){
        int n = arr.length;
        d = d%n;
        
        
        reverse(0,n-1,arr);
        reverse(0,d-1,arr);
        reverse(d,n-1,arr);
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
        
        rotArray(arr,3);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            
            
        }
        s.close();

    }
    
}
