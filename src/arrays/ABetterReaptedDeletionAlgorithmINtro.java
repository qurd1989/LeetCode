package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class ABetterReaptedDeletionAlgorithmINtro {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2,3,45, 5,6, 8,8};
        int newLength = removeDuplicates(nums);
        System.out.println(newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        for (int i = n-2; i >= 0; i--) {

            if (nums[i] == nums[i+1]){
                for(int j = i +1; j < n-1; j++){
                    nums[j] = nums[j+1];
                }
                n--;
            }

        }
        return n;
    }
    public static int removeDublicates1(int [] nums){
        int n = nums.length;

        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int result[] = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result.length;
    }

    public static int removeDublicates2(int [] nums){
        int n = nums.length;
        int j = 0;
        for (int i =0; i < n-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[j++] = nums[i];
            }
        }
        return j+1;
    }


}
