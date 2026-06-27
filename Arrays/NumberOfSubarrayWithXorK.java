package Arrays;
import java.util.*;

public class NumberOfSubarrayWithXorK {
    public int Solution(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int n = arr.length;
        int count = 0;
        int prefixXor = 0;

        for(int i = 0;i<n;i++){

            prefixXor ^= arr[i];
            int target = prefixXor^k;

            if(map.containsKey(target)){
                count += map.get(target);
            }

            map.put(prefixXor, map.getOrDefault(prefixXor,0) + 1);

            
        }

        return count;
    }

    public static void main(String[] args){
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        NumberOfSubarrayWithXorK obj  = new NumberOfSubarrayWithXorK();
        int result = obj.Solution(arr, k);
        System.out.println(result);
    }
    
    
}
