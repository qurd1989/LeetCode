package weeklyContest390;

public class MaximizeScoreOfNumbersInRanges {
    public static void main(String[] args) {
        MaximizeScoreOfNumbersInRanges maximizeScoreOfNumbersInRanges = new MaximizeScoreOfNumbersInRanges();
        int[] nums = {1, 2, 3, 4, 5};
        int[][] requests = {{1, 3}, {0, 1}};
        System.out.println(maximizeScoreOfNumbersInRanges.maximizeScore(nums, requests));
    }

    private boolean maximizeScore(int[] nums, int[][] requests) {
        int n = nums.length;
        int[] count = new int[n];
        for (int[] request : requests) {
            count[request[0]]++;
            if (request[1] + 1 < n) {
                count[request[1] + 1]--;
            }
        }
        for (int i = 1; i < n; i++) {
            count[i] += count[i - 1];
        }
        return false;
    }
}
