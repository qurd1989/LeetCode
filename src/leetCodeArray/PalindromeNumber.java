package leetCodeArray;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Palindrome");
        int x = sc.nextInt();
        System.out.println("Result is: " + isPalindrome(x));

    }

    public static  boolean isPalindromeNumber( int x ){

        if (x < 0){
            return false;
        }
        int n = x;
        int res = 0;
        while (x != 0){
           int reminder = x % 10;
            res = res * 10 + reminder;
            x /= 10;
        }
        if (res == n){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome(int x){
        String s = String.valueOf(x);
        int n = s.length();
        for (int i=0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
            return true;

    }
}
