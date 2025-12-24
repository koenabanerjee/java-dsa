package Sorting;

import java.util.*;

public class mergeSort {

    public static void merge(int arr[], int low,int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }

        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }

        for(int i = low;i<=high;i++){
            arr[i]= temp.get(i-low);
        }
    }
    public static void merSort(int arr[], int low, int high){
        if(low >= high){ 
            return;
        }
        int mid = (low+high)/2;
        merSort(arr, low, mid);
        merSort(arr, mid+1, high);
        merge(arr,low, mid, high);

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
        
        merSort(arr,0,size-1);
        System.out.print("The sorted array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            
            
        }
        s.close();

    }
}
