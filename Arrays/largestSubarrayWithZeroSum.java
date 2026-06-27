package Arrays;
import java.util.*;

public class largestSubarrayWithZeroSum{

    public int Solution(int[] arr){
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        int sum = 0;
        int maxi = 0;

        for(int i = 0;i<n;i++){
            sum += arr[i];

            if(sum == 0){
                maxi = i+1;
            }

            else{
                if(mpp.containsKey(sum)){
                    maxi = Math.max(maxi, i - mpp.get(sum));
                }
                else{
                    mpp.put(sum, i);
                }
            }
        }


        return maxi;
    }

    public static void main(String[] args){
        int[] arr = {1, -1, 3, 2, -2,  -8, 1, 7, 10, 23};
        largestSubarrayWithZeroSum obj = new largestSubarrayWithZeroSum();
        int ans = obj.Solution(arr);
        System.out.println(ans);
    }


}