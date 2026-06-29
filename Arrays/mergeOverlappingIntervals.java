package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {

        // Sort according to starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {

            // If no overlap
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(new int[]{interval[0], interval[1]});
            } 
            // Overlap
            else {
                merged.get(merged.size() - 1)[1] =
                        Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert List<int[]> to int[][]
        return merged.toArray(new int[merged.size()][]);
    }



    public static void main(String[] args) {

        mergeOverlappingIntervals sol = new mergeOverlappingIntervals();

        int[][] intervals = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        int[][] result = sol.merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

}