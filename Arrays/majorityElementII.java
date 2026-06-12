package Arrays;
import java.util.*;

class majorityElementII{

    public List<Integer> majEle(int nums[]){
        int n = nums.length;
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1 = 1;
                el1 = nums[i];
            } else if(cnt2 == 0 && nums[i]!=el1){
                cnt2 = 1;
                el2 = nums[i];
            } else if(nums[i] == el1){
                cnt1++;
            } else if(nums[i] == el2){
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == el1) cnt1++;
            if(nums[i] == el2) cnt2++;
        }

        //Adding elements to list
        List<Integer> result = new ArrayList<>();
        int mini = n/3 + 1;
        if(cnt1 >= mini) result.add(el1);
        if(cnt2 >= mini) result.add(el2);

        return result;
    }

    public static void main(String[] args){
        int nums[] = {1, 1, 1, 3, 3, 2, 2, 2};
        majorityElementII sol = new majorityElementII();
        List<Integer> result = sol.majEle(nums);

        System.out.println("The majority elements are : ");
        for(int it : result){
            System.out.print(it + " ");

        }
        System.out.println();
    }
}