package Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle{
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int row = 1; row <= numRows; row++) {
            long val = 1;
            List<Integer> ansRow = new ArrayList<>();

            ansRow.add(1);

            for(int col = 1; col < row; col++) {
                val = val * (row - col);
                val = val / col;

                ansRow.add((int) val);
            }

            ans.add(ansRow);
        }

        return ans;
    }

     public static void main(String[] args) {
        int N = 5; // Example: 5th row
        pascalTriangle sol = new pascalTriangle();
        List<List<Integer>> result = sol.generate(N);

        // Print the row
        for(List<Integer> row : result) {
                System.out.println(row);
}
    }
}