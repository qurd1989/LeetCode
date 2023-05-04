package arrays.easy;

public class ReplaceElementsWithGreatestElementOnRightSide {

//    Given an array arr, replace every element in that array with the greatest element among the elements to its right,
//    and replace the last element with -1.
    public static void main(String[] args) {

    }

    public int[] replaceElements(int[] arr) {
        int n = arr.length;

        int max =0;

        int ans [] = new int[n];

        for (int i = n -1; i>= 0; i--) {

            ans[i] = max;

            max = Math.max(max, arr[i]);


        }

        return ans;
    }
}

