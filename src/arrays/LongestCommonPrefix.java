package arrays;


//Write a function to find the longest common prefix string amongst an array of strings.

//If there is no common prefix, return an empty string "".

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;

        if (strs == null || strs.length == 0) {
            return "";
        }
        if (n == 1) {
            return strs[0];
        }

        int i = 0;
        while(true) {
            boolean flag = true;
            for (int j = 1; j < n; j++) {
                if (strs[j].length() <= i || strs[j -1].length() <= i
                || strs[j].charAt(i) != strs[j  -1].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                i++;

            }else {
                break;
            }
        }

   return  strs[0].substring(0, i);
    }
}
