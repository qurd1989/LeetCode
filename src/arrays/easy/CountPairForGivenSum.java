package arrays.easy;

import java.util.Arrays;
import java.util.HashSet;

public class CountPairForGivenSum {


//    In problem “count pair with given sum” we have given an integer array[] and another number say ‘sum’,
//    you have to determine whether any of the two elements in a given array has a sum equal to “sum”.
    public static void main(String[] args) {

        int arr[] = { 1, 4, 45, 6, 10, 8, 8, 17, 16, 15};
        int sum = 16;
        int[] result = solve(arr, sum);
        System.out.println(Arrays.toString(result));
    }

    public  static int[] solve(int arr[], int sum) {

        int n = arr.length;

        HashSet<Integer>hs = new HashSet<>();
        int count = 0;
        for (int i =0; i < n; i++) {
            int j = sum - arr[i];
            if (hs.contains(j)) {
                count++;
                System.out.println(count);
            }
            hs.add(arr[i]);
        }
        int result[] = new int[hs.size()];
        int i = 0;
        for (Integer num : hs) {
            result[i++] = num;

        }
        return result;
    }
}
