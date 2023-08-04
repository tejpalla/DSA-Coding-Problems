package Recursion;

public class RopeCuttingProblem {

    public static void main(String[] args){

        System.out.println("Maximum number of rope pieces : "+maxPieces(8,3,2,4));
        
    }

    public static int maxPieces(int n, int a, int b, int c){

        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }

        int res;

        res = Math.max(Math.max(maxPieces(n-a, a, b, c), maxPieces(n-b, a, b, c)),maxPieces(n-c, a, b, c));

        if(res == -1){
            return -1;
        }

        return res + 1;
    }
}
