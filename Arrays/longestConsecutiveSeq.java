package Arrays;
import java.util.*;

public class longestConsecutiveSeq {
    public boolean linearSearch(int[] arr, int x){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }

    //BRUTE FORCE APPROACH
    public int longestConsecutiveBrute(int[] arr){
        int n = arr.length;

        if(n == 0){
            return 0;
        }

        int longest = 1;
        for(int i = 0;i<n;i++){
            int x = arr[i];
            int cnt = 1;
            while(linearSearch(arr,x+1) == true){
                x += 1;
                cnt++;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    //BETTER APPROACH
    public int longestConsecutiveBetter(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        int longest = 1;
        int cntCurr = 0;
        int lsmaller = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i] - 1 == lsmaller){
                cntCurr++;
                lsmaller = arr[i];
            } else if(arr[i] != lsmaller){
                cntCurr = 1;
                lsmaller = arr[i];
            }
            longest = Math.max(longest, cntCurr);
        }
        return longest;
    }

    //OPTIMAL APPROACH
    public int longestConsecutiveOptimal(int[] arr){
        int n = arr.length;
        int longest = 1;

        Set<Integer> st = new HashSet<>();
        for(int i = 0;i<n;i++){
            st.add(arr[i]);
        }

        for(int it : st){
            if(!st.contains(it-1)){
                int cnt = 1;
                int x = it;

                while(st.contains(x+1)){
                    x = x+1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args){
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        longestConsecutiveSeq obj = new longestConsecutiveSeq();
        System.out.println("Longest Sequence using Brute force approach : " + obj.longestConsecutiveBrute(arr));
        System.out.println("Longest Sequence using Better approach : " + obj.longestConsecutiveBetter(arr));
        System.out.println("Longest Sequence using Optimal approach : " + obj.longestConsecutiveOptimal(arr));

    }

    
}
