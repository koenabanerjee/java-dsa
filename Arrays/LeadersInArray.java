package Arrays;
import java.util.*;

public class LeadersInArray {
    //brute force approach
    public ArrayList<Integer> LeadersInArrayBrute(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        for(int i = 0;i<n;i++){
            boolean leader = true;
            for(int j = i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    leader = false;
                    break;
                }
            }

            if(leader == true){
                ans.add(arr[i]);
            }
        
        }
        return ans;
    }

    //optimal approach
    public ArrayList<Integer> LeadersInArrayOptimal(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;

        for(int i = n-1;i>=0;i--){
            if(arr[i] > maxi){
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }

            Collections.reverse(ans);
            return ans;
    }



    public static void main(String[] args){
        int[] arr = {10,22,12,3,0,6};
        LeadersInArray finder = new LeadersInArray();

        // Get leaders using class method
        ArrayList<Integer> ans = finder.LeadersInArrayBrute(arr);
        ArrayList<Integer> ans1 = finder.LeadersInArrayOptimal(arr);

        System.out.print("Leaders in the array using brute force approach: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();

        System.out.print("Leaders in the array using optimal approach: ");
        for (int leader : ans1) {
            System.out.print(leader + " ");
        }
    }
}
