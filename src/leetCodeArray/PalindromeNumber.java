package leetCode;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Palindrome");
        int x = sc.nextInt();
        System.out.println("Result is: " + isPalindromeNumber(x));

    }

    public static  boolean isPalindromeNumber( int x ){


        if (x < 0){
            return false;
        }


        final  int numDigits = (int)(Math.floor(Math.log10(x)) +1);

        int msdMask  = (int)Math.pow(10, numDigits - 1);

        for (int i = 0;i <(numDigits / 2); ++i){

            if (x / msdMask != x % 10) {

                return false;

            }
            x %= msdMask;
            x /= 10;
            msdMask /= 100;

        }
        return  true;
    }
}
