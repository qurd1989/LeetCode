package arrays;

public class MinOperation {
    public static void main(String[] args) {
        int []nums = {1,2,2,3,4,5,6,6,6,7};
        int k = 6;
        int results[] = minOperation(nums, k);

        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]);
        }
    }

    public static int[] minOperation(int[] nums, int k)  {

        int i = 0;
        int temp[] = new int[nums.length];
        for(int j = 0; j < nums.length; j++) {
            if (nums[j] != k) {
                temp[i] = nums[j];
                i++;
            }
        }
        return temp;
    }
    public int searchInsert(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target)
                return pivot;
            if (target < nums[pivot])
                right = pivot - 1;
            else left = pivot + 1;
        }
        return left;
    }
}


