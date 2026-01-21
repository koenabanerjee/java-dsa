package Arrays;

import java.util.Scanner;

public class moveZeroesToEnd {
    public static void moveZeroesEnd(int arr[]){
        //TO GET THE FIRST ZERO OF THE ARRAY
       int j = -1;
       int n = arr.length;
       for(int i = 0;i<n;i++){
        if(arr[i]==0){
            j = i;
            break;
        }
       }

       if (j == -1) return; //if no zero found

       for(int i = j+1;i<n;i++){
        if(arr[i]!=0){
            //swap positions of element at idx i and of element at idx j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
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
       System.out.println("After moving zeroes to end");
       moveZeroesEnd(arr);
       for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
       }
        s.close();
    }
}
