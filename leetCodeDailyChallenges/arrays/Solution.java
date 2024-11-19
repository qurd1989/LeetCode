package arrays;

public class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largestE = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if(n < 2){
            return -1;
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > largestE){
                secondLargest = largestE;
                largestE = arr[i];

            }else if(secondLargest < arr[i] && arr[i] != largestE){
                secondLargest = arr[i];
            }

        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

}
