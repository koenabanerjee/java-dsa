package Arrays;

public class numAppearsOnce {
    public static int NumberAppearsOnce(int arr[]){
        int xorr = 0;
        for(int num : arr){
            xorr ^= num;
        }
        return xorr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 4,5};
        int result = NumberAppearsOnce(arr);
        System.out.println("The number that appears once in the array is: " + result);
    }
}
