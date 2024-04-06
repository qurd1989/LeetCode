package leetCodeArray;

public class RemoveDupicatedFromSortedArray {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
        if (n == 0){
            return 0;
        }
        int addIndexCurrentArray = 0;

        for (int i = 0; i < n; i++){
            if (nums[i] < nums[i+1]){
                nums[addIndexCurrentArray] = nums[i+1];
                addIndexCurrentArray++;
            }
        }
        return addIndexCurrentArray;
    }
}
