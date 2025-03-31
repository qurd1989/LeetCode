package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveElement {

    public static void main(String[] args) {

    }
    public int removeElement(int [] nums, int val) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int element : nums) {
                set.add(nums[element]);

        }
        return set.size();
    }
}
