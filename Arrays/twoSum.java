package Arrays;
import java.util.*;

public class twoSum {
    //THERE ARE TWO VARIATIONS FOR THIS QUES - 
    //FIRSTLY IT MAY BE ASKED TO JUST SAY YES/NO IF TWO ELEMENTS a and b exists such that a + b = target
    //THE SECOND VARIATION IS THE INDICES OF THE TWO ELEMENTS NEED TO BE RETURNED

    //BETTER APPROACH ( BRUTE FORCE IS JUST USING TWO LOOPS AND FINDING THE TWO ELEMENTS)

    //Variant 1
    public String twoSumExists(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        //Iterate over all the elements
        for(int i = 0;i<arr.length;i++){
            int complement = target - arr[i];
            //Check if complement exists in the map
            if(map.containsKey(complement)){
                return "YES";
            }
            //Store current element and its index
            map.put(arr[i],i);
        }
        //No pair found
        return "NO";
    }

    //Variant 2
    public int[] twoSumIndices(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int complement = target - arr[i];
            //If complement found, return indices
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            //Store current element and its index
            map.put(arr[i], i);
        }
        //No pair found
        return new int[]{-1, -1};
    }

    //Best Approach for Variant 1 - using two pointers
    public String twoSumBest(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return "YES";
            } else if(sum < target){ //the sum needs to be increased so therefore left pointer is moved forward
                left++;

            } else{ //sum needs to be decreased
                right--;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        twoSum sol = new twoSum();
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        System.out.println(sol.twoSumExists(arr, target));
        int[] res = sol.twoSumIndices(arr, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
        System.out.println(sol.twoSumBest(arr, target));

    }
}
