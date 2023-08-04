package Recursion;

public class PalindromeRecursion {

    public static void main(String[] args){

        String k = "markram";

        boolean n = isPalindrome(k,0,6);

        System.out.println("Given string is a palindrome "+n);
    }

    public static boolean isPalindrome(String s,int start, int end){

        if(start >= end){
            return true;
        }

        if(s.charAt(start) == s.charAt(end)){

            return isPalindrome(s, start + 1, end - 1);
        }
        else{
            return false;
        }
    }    
}
