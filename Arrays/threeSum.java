package Arrays;
import java.util.*;

public class threeSum {
    public List<List<Integer>> threeSumm(int[] arr, int n){

          // Sort the array
        Arrays.sort(arr);
        // Store final result
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // Skip duplicates for first element
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            // Two pointers
            int left = i + 1, right = n - 1;

            // Find pairs for current arr[i]
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    // Skip duplicates for left
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    // Skip duplicates for right
                    while (left < right && arr[right] == arr[right + 1]) right--;
                }
                else if (sum < 0) left++;
                else right--;
            }
        }
        return ans;
    }

     public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        threeSum obj = new threeSum();
        List<List<Integer>> res = obj.threeSumm(arr, n);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    
}
}
