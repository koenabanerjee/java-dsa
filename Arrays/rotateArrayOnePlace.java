package Arrays;

import java.util.Scanner;

public class rotateArrayOnePlace {
    public static void rotArrayOne(int arr[]){
        int temp = arr[0];
        int n = arr.length;
        for(int i = 1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
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
        System.out.println("The array after rotation by one place is : ");
        rotArrayOne(arr);
        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
    

}
