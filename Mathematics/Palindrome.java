package Mathematics;

public class Palindrome {

    public static void main(String[] args){

        int k = 2442;

        
        System.out.println("The value k is a palindrome " + isPalindrome(k));


    }

    static boolean isPalindrome(int number){

        int rev = 0;
        int k = 0;
        int f = number;

        while(number > 0){

            k = number % 10;

            rev = rev * 10 + k;

            number = number/10;

        }
        
        return (rev == f);
    }
}
