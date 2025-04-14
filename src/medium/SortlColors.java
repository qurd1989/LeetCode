package medium;

public class SortlColors {
    public static void main(String[] args) {

        int arr[] = {1,0,2,2,1,0,1,0,2};
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                 mid++;
            }else{
                swap(nums,mid,high--);
            }
        }
    }
    public static void swap(int[] sums, int i, int j) {
        int temp = sums[i];
        sums[i] = sums[j];
        sums[j] = temp;

    }
}