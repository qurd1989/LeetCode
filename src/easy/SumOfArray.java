package easy;

public class SumOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        SumOfArray obj = new SumOfArray();
        int[] result = obj.runningSum(nums);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

}
