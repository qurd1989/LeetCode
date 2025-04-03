package arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {

    }

    public static int thirdMax(int[] nums) {

        bubbleSort(nums);
        for(int i = 0; i < nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        int elementCoundted= 1;
        int prevElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prevElement) {
                elementCoundted += 1;
                prevElement = nums[i];
            }
            if (elementCoundted == 3) {
                return nums[i];
            }
        }
        return nums[0];

    }
    public static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                 }
            }
        }
        return arr;
    }

}
