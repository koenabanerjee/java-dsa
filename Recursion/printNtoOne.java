package Recursion;

import java.util.Scanner;

public class printNtoOne {
    public static void func(int n){
        if(n<1) return; //BASE CASE
        System.out.print(n + " ");
        func(n-1);
    }
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            func(n);
            s.close();

    }
}
