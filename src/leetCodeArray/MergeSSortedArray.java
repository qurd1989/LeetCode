package leetCodeArray;

public class MergeSSortedArray {

    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int  firstArray = m-1;
        int secondArray = n -1;
        int mergedArray = nums1.length -1;
        while(secondArray>=0) {
            if (firstArray >= 0 && (nums1[firstArray] > nums2[secondArray])) {
                nums1[mergedArray--] = nums1[firstArray--];
            } else
                nums1[mergedArray--] = nums2[secondArray--];
        }
    }
}
