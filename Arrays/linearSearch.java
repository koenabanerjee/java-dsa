package Arrays;

import java.util.Scanner;

public class linearSearch {
    public static int linSearch(int arr[], int num){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
        
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
        System.out.println("Enter the number which we need to find in the array :");
    int num = s.nextInt();
       System.out.println("The index at which the num occurs is " + linSearch(arr, num));
       s.close();
    }
}
