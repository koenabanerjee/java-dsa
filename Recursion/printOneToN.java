package Recursion;

import java.util.Scanner;

public class printOneToN {
    

public static void func(int i, int n){
        if(i>n) return; //BASE CASE
        System.out.print(i + " ");
        func(i+1,n);
    }
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            func(1,n);
            s.close();

    }
}