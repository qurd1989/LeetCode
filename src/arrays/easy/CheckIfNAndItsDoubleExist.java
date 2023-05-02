package arrays.easy;

import java.util.HashMap;

public class CheckIfNAndItsDoubleExist {


//    Given an array arr of integers, check if there exist two indices i and j such that :
//
//    i != j
//    0 <= i, j < arr.length
//    arr[i] == 2 * arr[j]

    public static void main(String[] args) {

    }

    public boolean checkIfExist(int[] arr) {
        int n = arr.length;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hashMap.put(arr[i], i);

        }
        for (int i = 0; i < n; i++)
        {
            if (hashMap.containsKey(arr[i] * 2) && hashMap.get(arr[i] *2) != i);
               return true;
        }
        return false;
    }
}
