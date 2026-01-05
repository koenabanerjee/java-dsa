package Arrays;

import java.util.Scanner;

public class sLargeAndsSmall {
     public static int secondLargest(int arr[]){
            int n = arr.length;
            int largest = arr[0];
            int slargest = -1;
            for(int i = 1;i<n;i++){
                if(arr[i]>largest){
                    slargest = largest;
                    largest = arr[i];
                }
                else if(arr[i]<largest && arr[i]> slargest){
                    slargest = arr[i];
                }
            }
            return slargest;
        }

        public static int secondSmallest(int arr[]){
            int n = arr.length;
            int smallest = arr[0];
            int sSmallest = Integer.MAX_VALUE;
            for(int i = 1;i<n;i++){
                if(arr[i]<smallest){
                    sSmallest = smallest;
                    smallest = arr[i];
                }
                else if(arr[i]>=smallest && arr[i]<sSmallest){
                    sSmallest = arr[i];
                } 
            }
            return sSmallest;
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
        
        System.out.println("The second largest and second smallest numbers in the array is : " + secondLargest(arr)+ " and " + secondSmallest(arr));
        
        s.close();

    
    }
    }

