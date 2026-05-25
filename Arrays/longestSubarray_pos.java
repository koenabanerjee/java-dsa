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

    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;

        // To store the maximum length of the subarray
        int maxLen = 0;

        // Pointers for sliding window
        int left = 0, right = 0;

        // Sum of the current window
        int sum = arr[0];

        // Traverse through the array
        while (right < n) {

            // Shrink the window if sum exceeds k
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // Update max length if sum equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Expand the window to the right
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }

        return maxLen;
    }

   public static void main(String[] args) {
    int[] arr = {2, 3, 5, 1, 9};
    long k = 10;
    int z = 10;

    int result = longestSubarrayWithSum(arr, k);
    System.out.println("Longest subarray length: " + result);

    longestSubarray_pos sol = new longestSubarray_pos();

        // Function call to find the result
        int ans = sol.longestSubarray(arr, z);

        // Output the result
        System.out.println("The length of longest subarray having sum k is: " + ans);
   }
}
