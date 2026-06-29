package Patterns;

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

public class InvertedRightPyramid {
    public void Pattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        InvertedRightPyramid obj = new InvertedRightPyramid();
        obj.Pattern(n);
    }
}
