package Hashing;

import java.util.HashMap;
import java.util.Map;

public class highest_lowestFreq {
    
    //USING TWO Loops
    public static void highLowestFreq(int arr[], int n){
        boolean visited[] = new boolean[n];
        int maxFreq = 0;
        int maxEle = 0;
        int minFreq = n;
        int minEle = 0;
        for(int i = 0;i<n;i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j = i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count > maxFreq){
                maxEle = arr[i];
                maxFreq = count;
            }

            if(count < maxFreq){
                minEle = arr[i];
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is " + maxEle + " with frequency : "+ maxFreq);
        System.out.println("The lowest frequency element is " + minEle + " with frequency : "+ minFreq);

    }

    //USING map
    public static void freqWithMap(int arr[], int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else{
                map.put(arr[i], 1);
            }
        }
        int maxFreq = 0;
        int maxEle = 0;
        int minFreq = n;
        int minEle = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > maxFreq){
                maxEle = element;
                maxFreq = count;

            }if(count < minFreq){
                minEle = element;
                minFreq = count;
            }
            
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);


    }
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        highLowestFreq(arr, n);

        freqWithMap(arr, n);

    }
}
