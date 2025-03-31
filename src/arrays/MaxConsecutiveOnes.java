package arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count =0;
        for(int val : nums) {
            count = (val == 1) ? ++count: 0;

            max = Math.max(count, max);
        }
        return max;
    }
}
