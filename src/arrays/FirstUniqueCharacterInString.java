package arrays;

import java.util.HashMap;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {

//        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    }
    public int firstUniqChar(String s) {

        int n = s.length();

        HashMap<Character, Integer> hs = new HashMap<>();

        for(int i = 0; i < n; i ++) {

            char c = s.charAt(i);

            hs.put(c, hs.getOrDefault(c, 0) +1);

        }
        for(int i =0; i < n; i++) {

            if(hs.get(s.charAt(i)) ==1) {

                return i;
            }
        }

        return -1;
    }
}

