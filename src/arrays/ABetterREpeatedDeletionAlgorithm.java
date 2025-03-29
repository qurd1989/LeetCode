package arrays;

import java.util.Arrays;

public class ABetterREpeatedDeletionAlgorithm {
    public static void main(String[] args) {
        ABetterREpeatedDeletionAlgorithm aBetterREpeatedDeletionAlgorithm = new ABetterREpeatedDeletionAlgorithm();
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(aBetterREpeatedDeletionAlgorithm.sortArrayByParity1(arr)));
    }
    public int[] sortArrayByParity(int[] A){

            Integer[] B = new Integer[A.length];
            for (int t = 0; t < A.length; ++t)
                B[t] = A[t];

            Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

            for (int t = 0; t < A.length; ++t)
                A[t] = B[t];
            return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */

    }
    public int[] sortArrayByParity1(int[] nums) {
     int j = nums.length -1;
     int i = 0;
     while(i < j) {
         if(nums[i] % 2 > nums[j] % 2) {
             int temp = nums[i];
             nums[i] = nums[j];
             nums[j] = temp;
         }
         if(nums[i] % 2 == 0 && nums[j] % 2 == 1) {
             i++;
                j--;
         }
     }
        return nums;
    }
}

