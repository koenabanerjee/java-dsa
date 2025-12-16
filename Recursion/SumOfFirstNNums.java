package Recursion;

import java.util.Scanner;

public class SumOfFirstNNums {
    public static void parameterised(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        parameterised(i-1, sum+i);
    }

    public static int functional(int n){
        if(n==0){
            return 0;
        }
        return n + functional(n-1);
    }

    
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            parameterised(n,0);
            System.out.println(functional(n));
            s.close();

    }
}
