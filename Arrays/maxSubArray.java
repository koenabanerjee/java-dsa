package Arrays;

public class maxSubArray {
    //optimal approach - kadane's algorithm
    public static int KadaneAlgo(int[] arr){
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int n = arr.length;

        for(int i = 0;i<n;i++){
            sum += arr[i];

            if(sum > maxi){
                maxi = sum;
            }

            if(sum<0){
                sum = 0;
            }
        }
        return (int)maxi;

    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArray sol = new maxSubArray();
        int result = sol.KadaneAlgo(arr);
        System.out.println("The maximum subarray sum is " + result);

    }
}
