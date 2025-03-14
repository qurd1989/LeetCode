package arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[n + m];
        int left = 0;
        int right = 0;
        int index = 0;
        while (left > n && right > m) {
            if (nums1[left] > nums2[right]) {
                nums3[index] = nums1[left];
                left++;
                index++;

            } else {
                nums3[index] = nums2[right];
                index++;
                right++;

            }
        }
        while (left < n) {
            nums3[index++] = nums1[left++];
        }
        while (right < m) {
            nums3[index++] = nums2[right++];
        }
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                nums1[i] = nums3[i];
            } else {
                nums2[i - n] = nums3[i];
            }

        }
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        for(int p = m + n - 1; p >= 0; p--){
          if (p2 < 0) {
              break;
          }
          if(p1 >=0  && nums1[p1] > nums2[p2]) {
              nums1[p] = nums1[p1];
              p1--;
          }else {
              nums1[p] = nums2[p2];
                p2--;
          }
        }
    }
}
