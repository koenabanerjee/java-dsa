package Arrays;

import java.util.HashMap;

public class longestSubarray_pos {
    //BETTER APPROACH
   public static int longestSubarrayWithSum(int[] arr, long k){
    HashMap<Long, Integer> preSumMap = new HashMap<>();

    long sum = 0;
    int maxLen = 0;

    for(int i = 0;i<arr.length;i++){
        sum += arr[i];

        //if sum equals k
        if(sum == k){
            maxLen = Math.max(maxLen, i+1);
        }

        long rem = sum - k;

        //Check if remainder exists
        if(preSumMap.containsKey(rem)){
            int len = i - preSumMap.get(rem);
            maxLen = Math.max(maxLen, len);
        }

        //Store prefix sum only if not already present
        if(!preSumMap.containsKey(sum)){
            preSumMap.put(sum,i);
        }
    }
    return maxLen;
   } 

   public static void main(String[] args) {
    int[] arr = {2, 3, 5, 1, 9};
    long k = 10;

    int result = longestSubarrayWithSum(arr, k);
    System.out.println("Longest subarray length: " + result);
   }
}
