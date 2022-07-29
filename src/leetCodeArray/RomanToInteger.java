package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter String: ");


        String str = sc.nextLine();


        System.out.println("Result is: " + romanToInt(str));


    }

    public static int romanToInt(String S) {


        Map<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int result = 0;

        for (int i = 0; i < S.length(); i++) {

            char ch = S.charAt(i);


            if (i > 0 && roman.get(ch) > roman.get(S.charAt(i - 1))) {

                result += roman.get(ch) - 2 * roman.get(S.charAt(i - 1));


            } else

                result += roman.get(ch);


        }
        return result;


    }
}
