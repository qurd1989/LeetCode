package weeklyContest390;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximiumLengthSubStringWithTwoOccurrences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(maximumLengthSubstring1(s));
    }

    public static int maximumLengthSubstring(String s) {

        int n = s.length();
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int arr[] = new int[26];
            for (int j = 0; j < n; j++) {
                if (++arr[s.charAt(j) - 'a'] == 3) {
                    break;
                }
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }

    public static int maximumLengthSubstring1(String s) {
        int left = 0, right = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!map.containsKey(currentChar)) {
                map.put(currentChar, 0);
            }
            map.put(currentChar, map.get(currentChar) + 1); // Increment count
            while (map.get(currentChar) > 2) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left +1);
            right++;
        }
        return maxLength;
    }
}
