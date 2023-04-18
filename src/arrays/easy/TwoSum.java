package arrays.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

/*    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
        */
    public static void main(String[] args) {

        int[] sums = {1, 2, 3, 4, 5, 6, 7,};
        int target = 8;

        int j[] = solve(sums, target);
        for (int i = 0; i < sums.length; i++) {


            System.out.println(Arrays.toString(j));
        }
    }

    public static int[] solve(int[] nums, int target) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] solve1(int nums[], int tagret) {


        int n =nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i =0; i < n; i++) {
            int compmlement = tagret - nums[i];
            if (hm.containsKey(compmlement)){

                return new int[] {hm.get(compmlement), i};

            }
            hm.put(nums[i], i);
        }

        return null;

    }
}