package Arrays;

public class majorityElement {

    //OPTIMAL APPROACH -> MOORE'S VOTING ALGORITHM
    public int majorityEle(int[] arr){
        int n = arr.length;
        int cnt = 0;
        int el = 0;

        //finding the potential majority element
        for(int i = 0;i<n;i++){
            if(cnt == 0){
                cnt = 1;
                el = arr[i];
            }

            else if(arr[i] == el){
                cnt++;
            } else{
                cnt--;
            }
        }

        //counting the freq of potential majority element
        int cnt1 = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == el){
                cnt1++;
            }
        }

        //Checking if the potential majority element is actually the majority element in the array - if it is greater than n/2
        if(cnt1 > n/2){
            return el;
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        majorityElement sol = new majorityElement();
        int result = sol.majorityEle(arr);
        System.out.println("The majority element in the array is "+ result);
    }
}
