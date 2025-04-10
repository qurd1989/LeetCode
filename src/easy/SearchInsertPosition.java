package easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6,7,8,23,34,45,65,76};
        int target = 23;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right =nums.length, index = 0;

        while (left <= right) {
            index = left + (right - left) /2; //if array size is 11, index will be 5

            if (nums[index] == target) { //
                System.out.println(nums[index]);
                return index;
            }else if (nums[index] > target) {
                System.out.println(nums[index]);
                right = index-1;
            }else{
                System.out.println(nums[index]);
                left = index+1;
            }
        }
        return left;
    }
}
