package leetCodeArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


//        int [] givenArray = new int[length];
//
//        System.out.println("Enter  Array: ");
//        for (int i = 0; i<length; i++) {
//
//            givenArray[i] = sc.nextInt();
//
//
//
//        }
//        int target = sc.nextInt();
//
//        System.out.println("Result is : "  + Arrays.toString(twoIdex(givenArray, target)));
//

    }


    private static int[] twoIdex(int[] nums, int target){

        for (int i =0; i<nums.length; i++){

            for (int k = i +1; k< nums.length; k++) {

                if (nums[i] + nums[k] == target){
                    return new int[] {i, k};
                }
            }
        }
        return new int[] {};
    }
    public static int[] twoSum1(int[] num, int target){
        int result [] = new int[2];
        for (int i =0; i < num.length; i++) {
            for (int j = i; j < num.length; i++) {
                if (num[i] + num[j] == target) {
                    result[0] = i;
                    result[1] = j;

                }
            }
        }
        return result;
    }
    public static int[] twoSum2(int[] nums, int target){

        int n = nums.length;
        Map<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++){
            int num = target - nums[i];
            if (hs.containsKey(num)){
                return new int[] {hs.get(num), i};
            }else
                hs.put(nums[i], i);
        }
        return new int[]{};
    }

}
