package arrays.easy;

public class ValidMountainArray {

    public static void main(String[] args) {

    }



    public boolean validMountainArray(int[] arr) {

        int n = arr.length;


        int start = 0;
        int end = n-1;
        while(start > 0 && arr[start] > arr[start + 1]){
            start++;
        }
        while (end < n -1 && arr[end] >arr[end - 1]) {
            end++;
        }

        return start == end & start != 0 && end != n-1;
    }
}
