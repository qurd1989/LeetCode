package arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnesTwo(arr));
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
    public static int findMaxConsecutiveOnesTwo(int[] nums) {
        int max = 0;
        int currOnes = 0, prevOnes = 0, seenZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                seenZero = 1;
                prevOnes = currOnes;
                currOnes = 0;
            } else {
                currOnes++;
            }

            max = Math.max(max, currOnes + prevOnes + seenZero);
        }

        return max;
    }

}
