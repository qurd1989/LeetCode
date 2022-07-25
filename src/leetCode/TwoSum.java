package leetCodeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {



    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lenght of Array: ");

        int length = sc.nextInt();

        int [] givenArray = new int[length];


        System.out.println("Enter  Array: ");
        for (int i = 0; i<length; i++) {

            givenArray[i] = sc.nextInt();



        }
        int target = sc.nextInt();

        System.out.println("Result is : "  + Arrays.toString(twoIdex(givenArray, target)));


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


}
