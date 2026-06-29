package Patterns;

public class InvertedStarPyramid {
     public void Pattern(int n){
        
        for(int i = 0;i<n;i++){
            //Spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=0;j<2*n - (2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();

        }

        
    }

    public static void main(String[] args){
        int n = 5;
        InvertedStarPyramid obj = new InvertedStarPyramid();
        obj.Pattern(n);
    }
}
