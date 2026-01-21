package Arrays;

import java.util.*;
import java.util.Scanner;

public class union {

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++; j++;
            }
        }

        while (i < n) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) arr1[i] = s.nextInt();

        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) arr2[i] = s.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        union obj = new union();
        ArrayList<Integer> result = obj.findUnion(arr1, arr2);

        for (int val : result) System.out.print(val + " ");
        s.close();
    }
}
