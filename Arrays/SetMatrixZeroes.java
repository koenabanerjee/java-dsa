package Arrays;

public class SetMatrixZeroes {

    public void SolutionOptimal(int[][] arr){
        int m = arr.length; // no of rows
        int n = arr[0].length; //no of cols

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for(int i = 0;i<n;i++){
            if(arr[0][i] == 0){
                firstRowZero = true;
                break;
            }
        }

        for(int i = 0;i<m;i++){
            if(arr[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }
        if(firstRowZero){
            for(int i = 0;i<n;i++){
                arr[0][i] = 0;
            }
        }

        if(firstColZero){
            for(int i = 0;i<m;i++){
                arr[i][0] = 0;
            }
        }

    }

    public static void main(String[] args){
        SetMatrixZeroes obj = new SetMatrixZeroes();
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        obj.SolutionOptimal(arr);
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
}
