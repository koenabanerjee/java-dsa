package Arrays;

public class nextPermutation {
    //we will start with the optimal approach - brute force approach uses recursion

    public void nextPerm(int[] arr) {
        int n = arr.length;
        int idx = -1;
        //we will find the first dip
        for(int i = n-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
            idx = i;
            break;
        }
    }

    if(idx == -1){// the given array is the greatest permutation therefore we will fallback to the first permutation
        reverse(arr, 0, n-1);
        return;
    }

    //we need to find the element between idx+1 and n-1 that is just greater than element at idx

    for(int i = n-1;i>=idx;i--){
        if(arr[i] > arr[idx]){
            swap(arr,i,idx);
            break;
        }
    }

    //we will sort or like reverse the array from idx+1 to n-1
    reverse(arr, idx+1, n-1);
            
        
    }
        
    //helper function to reverse
    public void reverse(int[] arr, int start, int end){
        while(start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    //helper function to swap
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        nextPermutation obj = new nextPermutation();
        obj.nextPerm(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
