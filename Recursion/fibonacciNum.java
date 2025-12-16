package Recursion;

public class fibonacciNum {

    public static int func(int n){
        if(n<=1) return n;
        return func(n-1) + func(n-2);
    }
    public static void main(String[] args) {
        System.out.println(func(5));
    }
}