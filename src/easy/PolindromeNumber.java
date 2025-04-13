package easy;

public class PolindromeNumber {

    public static void main(String[] args) {

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
    public   boolean isPalindrome1(int x) {
        String s = String.valueOf(x);
        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }
}
