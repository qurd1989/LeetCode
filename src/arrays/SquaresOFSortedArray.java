package arrays;

public class SquaresOFSortedArray {
    public static void main(String[] args) {
        int arr[] = {-7,-3,2,3,11};
        System.out.println(sortedSquares(arr));
        int result[] = sortedSquares(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int pos = n - 1;
        int ans[] = new int[n];
        while (left <= right) {
            int leftValue = nums[left] * nums[left];
            int rightValue = nums[right] * nums[right];

            if (leftValue > rightValue) {
                ans[pos] = leftValue;
                left++;
            } else {
                ans[pos] = rightValue;
                right--;
            }
            pos--;
        }
        return ans;
    }
}
