package Arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayBySign {
    //BRUTE FORCE APPROACH - since the number of positive and negative elements are the same, we put positives into an array called “pos” and negatives into an array called “neg”.

    public static int[] rearrangeBySignBrute(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int n = arr.length;

        //separate pos and negs
        for(int i = 0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            } else{
                neg.add(arr[i]);
            }
        }

        //place pos at even indices and negs at odd indices
        for(int i = 0;i<n/2;i++){
            arr[2*i] = pos.get(i);
            arr[2*i + 1] = neg.get(i);
        }

        return arr;
    }

    //OPTIMAL APPROACH - WE WILL DO SINGLE TRAVERSAL AND PLACE THE ELEMENTS ACCORDINGLY

    public static int[] rearrangeBySignOptimal(int[] arr){
        int n = arr.length;
        //initialize the result arr
        int[] ans = new int[n];
        int posIdx = 0;
        int negIdx = 1;

        for(int i = 0;i<n;i++){
            if(arr[i] > 0){
                ans[posIdx] = arr[i];
                posIdx += 2;

            }
            else{
                ans[negIdx] = arr[i];
                negIdx += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        RearrangeArrayBySign obj = new RearrangeArrayBySign();
        int[] result = obj.rearrangeBySignBrute(arr);
        int[] result1 = obj.rearrangeBySignOptimal(arr);

        System.out.println("Resultant array using brute force approach");
        for(int i = 0;i<arr.length;i++){
            System.out.print(result[i] +" ");
        }

        System.out.println("Resultant array using optimal approach");

         for(int i = 0;i<arr.length;i++){
            System.out.print(result1[i] +" ");
        }

        
    }

}
