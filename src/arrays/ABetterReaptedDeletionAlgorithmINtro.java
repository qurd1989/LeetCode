package arrays;

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
}
