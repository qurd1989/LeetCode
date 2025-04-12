package easy;

public class PlusOne {
    public static void main(String[] args) {

        int arr[] = {9,9,9};
        int resultp[] = plusOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(resultp[i] + " ");
        }
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n-1; i > 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
