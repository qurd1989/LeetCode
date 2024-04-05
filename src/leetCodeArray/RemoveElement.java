package leetCodeArray;

public class RemoveElement {
    public static void main(String[] args) {

        int arr[] = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(arr, val));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

