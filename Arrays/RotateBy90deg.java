package Arrays;

public class RotateBy90deg {
    //brute force - we use an extra 2d array to return the rotated matrix

    public int[][] rotateClockwiseBrute(int[][] matrix){
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                rotated[j][n-i-1] = matrix[i][j];
            }
        }
        return rotated;
    }

    public void  rotateClockwiseOptimal(int[][] matrix){
        int n = matrix.length;

        //STEP - 1 Tranpose the matrix
        for(int i = 0;i<=n-2;i++){
            for(int j = i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //STEP - 2 Reverse each row of the tranposed matrix
        for(int i = 0;i<n;i++){
            int left = 0;
            int right = n-1;

            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args){
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        RotateBy90deg obj = new RotateBy90deg();
        int[][] rotated = obj. rotateClockwiseBrute(mat);
       

        System.out.println("Result using brute force approach : ");
        // Print the rotated matrix
        for (int[] row : rotated) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println("Result using optimal approach : ");
         obj. rotateClockwiseOptimal(mat);
         for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
