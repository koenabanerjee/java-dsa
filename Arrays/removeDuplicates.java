package Arrays;

import java.util.Scanner;

public class removeDuplicates {
    public static int removeDups(int arr[]){
        int i = 0;
        int n = arr.length;
        for(int j = 1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1; //returns the length of the array after removing dups

        
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
        System.out.println("The size of the array after removing duplicate elements is "+removeDups(arr));
    }
}
