package easy;

public class PolindromeNumber {

    public static void main(String[] args) {


        String s = "aa";
        System.out.println(isPalindrome2(s));
    }
    public   boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reversed = 0;
        while (x > 0) {
             int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /=10;
        }
        if (reversed == temp) {
            return true;
        }return false;
    }
    public static boolean isPalindrome1(int x) {
        String s = String.valueOf(x);
        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }

    public static boolean isPalindrome2(String s) {

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
