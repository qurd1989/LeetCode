package arrays;

import java.util.Arrays;

public class InPlaceOperations {

    public static void main(String[] args) {
        InPlaceOperations inPlaceOperations = new InPlaceOperations();
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(inPlaceOperations.replaceElements(arr)));
    }
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = -1;
        for (int i = n - 1; i >= 0; i--) {
            int current  = arr[i];
            arr[i] = maxRight;

            maxRight = Math.max(maxRight, current);
        }
        arr[n - 1] = -1;
            return  arr;
    }
}
