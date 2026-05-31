package Arrays;
import java.util.*;
public class CountSubarrayWithSum {

    //Optimal approach
    public int CountSubarray(int[] arr, int k){
        int n = arr.length;

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        //Base case : Prefix sum 0 has occurred once
        prefixSumCount.put(0,1);

        for(int i=0;i<n;i++){
            prefixSum += arr[i];

            // Calculate the prefix sum that needs to be removed
            int remove = prefixSum - k;

            // If this prefix sum has been seen before,
            // add its count to the result
            if(prefixSumCount.containsKey(remove)){
                count += prefixSumCount.get(remove);
            }

            prefixSumCount.put(prefixSum , prefixSumCount.getOrDefault(prefixSum , 0) + 1);


        }

        return count;


    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        CountSubarrayWithSum obj = new CountSubarrayWithSum();

        int result = obj.CountSubarray(arr, k);

        System.out.println("The number of subarrays is : " + result);

    }
    
}
