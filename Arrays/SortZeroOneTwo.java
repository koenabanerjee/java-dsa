package Arrays;



class SortZeroOneTwo{
    //THIS IS THE THE OPTIMAL APPROACH WHICH USES THE DUTCH NATIONAL FLAG ALGORITHM
    // THE BETTER APPROACH USES THREE COUNTER VARIABLES TO COUNTER THE FREQUENCIES Of 1s, 2s and 3s AND THEN OVERWRITE THEM INTO THE ARRAY
    public void DutchNationalFlagAlgo(int[] nums){
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                //swap element with element at low
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                //we will move the mid pointer forward
                mid++;
            }
            else{
                //if nums[mid] == 2
                //swap element with nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high --;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 0 , 1, 2, 1, 2, 0, 0, 0, 1};
        SortZeroOneTwo sol = new SortZeroOneTwo();
        sol.DutchNationalFlagAlgo(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }

        

    }
}