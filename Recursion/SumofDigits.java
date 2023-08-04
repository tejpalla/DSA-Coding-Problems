package Recursion;

public class SumofDigits {

    public static void main(String[] args){

        int k = 6565765;

        int sum = sumofDigits(k);

        System.out.println("sum of digits for integer k is "+sum);
    }

    public static int sumofDigits(int k){

        if(k == 0){
            return 0;
        }

        return k % 10 + sumofDigits(k/10);
    }
    
}
