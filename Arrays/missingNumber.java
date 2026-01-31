package Arrays;

import java.util.Scanner;

public class missingNumber {
    public static int missingNum(int arr[], int N){
        int xor1 = 0, xor2 = 0;
        int n = N - 1;
        for(int i = 0;i<n;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ i+1;
        }
        xor1 = xor1^N;
        return xor1^xor2;

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
        System.out.println("Enter N : ");
        int N = s.nextInt();

        System.out.println("The missing number in the array from 1 to N is "+ missingNum(arr, N));
       s.close();
    }
    
}
