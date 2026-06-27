package Patterns;

// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 

public class RectangularStar {
    public void Pattern(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        RectangularStar obj = new RectangularStar();
        obj.Pattern(n);
    }
    
}
