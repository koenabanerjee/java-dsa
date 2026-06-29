package Patterns;

// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 

public class InvertedNumberedRightPyramid {
     public void Pattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n+1-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        InvertedNumberedRightPyramid obj = new InvertedNumberedRightPyramid();
        obj.Pattern(n);
    }
    
}
