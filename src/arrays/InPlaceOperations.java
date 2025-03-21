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

        int j = 0;
        for (int i = 0; i < n -1; i++) {
            if (arr[i] < arr[i + 1]) {
                arr[j] = arr[i+1];
                j++;
            }else {
                arr[i] = arr[i + 1];
                j++;
            }

        }
        arr[n-1] = -1;
            return  arr;
    }
}
