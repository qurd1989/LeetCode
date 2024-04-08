package leetCodeArray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDupicatedFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n-1 ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int addIndexCurrentArray = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[addIndexCurrentArray]) {
                nums[addIndexCurrentArray] = nums[i];
                addIndexCurrentArray++;
            }
        }
        return addIndexCurrentArray;
    }
}
