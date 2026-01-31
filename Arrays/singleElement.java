package Arrays;

import java.util.Scanner;

public class singleElement {
    public static int getSingleEle(int arr[]){
        int xor = 0;
        for(int i = 0;i<arr.length;i++){
            xor = xor^arr[i];
        }
        return xor;

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
        

    System.out.println("The single element in the array is "+ getSingleEle(arr));
       s.close();
    }
}
