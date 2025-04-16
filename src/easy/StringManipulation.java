package easy;

public class StringManipulation {
    public static void main(String[] args) {

    }

    public static String SimpleForLoop(String s) {
        int n = s.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = n-1; i < 0; i++) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static String twoPointer(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return chars.toString();
    }
}
