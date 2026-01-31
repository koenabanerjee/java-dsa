package Arrays;

import java.util.Scanner;

public class maxConseOnes {
    public static int maximumConsecutiveOnes(int arr[]){
        int max = 0;
        int cnt = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        return max;

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
        

    System.out.println("The maximum number of consecutive ones are : "+ maximumConsecutiveOnes(arr));
       s.close();
    }
}
