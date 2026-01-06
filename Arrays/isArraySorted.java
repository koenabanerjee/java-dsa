package Arrays;

import java.util.Scanner;

public class isArraySorted {

    public static void isArraySort(int arr[]){
        int n = arr.length;
        int flag = 0;
        for(int i = 1;i<n;i++){
            if(arr[i-1]<=arr[i]){
                flag = 0;
            } else{
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.print("Array is sorted");
        } else {
            System.err.print("Array is not sorted");
        }
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
        isArraySort(arr);
        s.close();
        
        

    
    }
}
