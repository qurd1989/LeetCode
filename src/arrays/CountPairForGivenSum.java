package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CountPairForGivenSum {


//    In problem “count pair with given sum” we have given an integer array[] and another number say ‘sum’,
//    you have to determine whether any of the two elements in a given array has a sum equal to “sum”.
    public static void main(String[] args) {

        int arr[] = { 1, 4, 45, 6, 10, 8, 8, 17, 16, 15};
        int sum = 16;
        int[][] result = solve(arr, sum);
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }


        int[] array = new int[6];

// Current length is 0, because it has 0 elements.
        int length = 0;



// Add 3 items into it.
        for (int i = 0; i < 3; i++) {
            array[i] = i * i;
            // Each time we add an element, the length goes up by one.
            length++;
        }

        System.out.println("The Array has a capacity of " + array.length);
        System.out.println("The Array has a length of " + length);
    }

    public  static int[][] solve(int arr[], int sum) {

        int n = arr.length;

        HashSet<Integer>hs = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int j = sum - arr[i];
            if (hs.contains(j)) {
                int[] pair = {j, arr[i]};
                pairs.add(pair);
            }
            hs.add(arr[i]);

        }
        int[][] result = new int[pairs.size()][2];
        int i = 0;

        for (int[] pair : pairs) {
            result[i++] = pair;

        }
        return result;
    }
}
